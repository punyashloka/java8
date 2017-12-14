package java8.stream;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class StreamOperations {
	
	public static List<Dish> dishes = Dish.menu;
	public static void main(String[] args) {
	
		/*
		 * Stream operations that can be connected are called intermediate operations, and operations
		 * that close a stream are called terminal operations
		 * 
		 * 
		 * 
		 * intermediate operations returns the same stream
		 * don’t perform any processing until a terminal operation is invoked on the stream
		 *	pipeline—they’re lazy
		 *  pipeline to pipeline 
		 * 
		 */
		
		List<String> names = dishes.stream()
							.filter(dish -> {
								System.out.println("filter " + dish.getName() + "---" + dish.getCalories());
								System.out.println();
								return dish.getCalories() > 250;
							}).map(dish -> {
								System.out.println("mapping" + dish.getName()+ "---" + dish.getCalories());
								System.out.println();
								return dish.getName() + "herllo";
							}).limit(3)
							.collect(toList());
							
							
							System.out.println(names);
							
							
							/*
							 * filter pork---800
							mappingpork---800
							filter wheat---50 - noy mached dish.getCalories() > 250;
							filter beef---700
							mappingbeef---700
							filter rice---100 --dish.getCalories() > 250;
							filter chicken---400
							mappingchicken---400 // it reached  limit 3 so stop filtering other
							
							[pork, beef, chicken]
							 */
		
							System.out.println(" Terminal operations-------------");
		/*
		 * Terminal operations produce a result from a stream pipeline. A result
		 * is any nonstream value such as a List, an Integer, or even void.
		 * 
		 * 
		 */
							System.out.println(dishes.stream().distinct().count());
							System.out.println(dishes.stream().count());
							dishes.stream().distinct().forEach(System.out::println);
							Integer sum = dishes.stream().mapToInt(dish -> dish.getCalories()).sum();
							System.out.println(sum);
		
							System.out.println("************************************");
							
							dishes.stream().distinct().forEach(System.out::println);// based on equals and hash code
		
							System.out.println("///////");
							dishes.stream().sorted().forEach(System.out::println);// based on compateTo()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
