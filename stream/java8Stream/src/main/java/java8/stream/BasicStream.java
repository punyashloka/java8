package java8.stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicStream {

	public static void main(String[] args) {

List<Dish> dishList = Dish.menu;
	
Collections.sort(dishList, new Comparator<Dish>() {
	@Override
	public int compare(Dish o1, Dish o2) {
		return o1.getCalories().compareTo(o2.getCalories());
	}
});
	for (Dish dish : dishList) {
	System.out.println(dish.getCalories());
}

	 List<String> list = dishList.stream()
	.filter(dish -> dish.getCalories() > 200)
	.sorted(comparing(Dish :: getCalories ))
	 .map(Dish::getName)
     .collect(toList());
     //.forEach(System.out::println);

	
	}}
