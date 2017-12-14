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
								return dish.getName();
							}).limit(3)
							.collect(toList());
							
							
							System.out.println(names);
							
							
							/*
							 * filter pork---800
							mappingpork---800
							filter wheat---50
							filter beef---700
							mappingbeef---700
							filter rice---100
							filter chicken---400
							mappingchicken---400 // it reached  limit 3 so stop filtering other
							
							[pork, beef, chicken]
							 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
