package com.syne.api.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class PredicateDemo {
	
	public static Predicate<Apple> isWeightAbove100() {
		return apple -> apple.getWeight() >= 100;
	}
	
	public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
		return apples.stream().filter(predicate).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("green", 20.0), new Apple("red", 10.0),
				new Apple("brown", 150.0), new Apple("yellow", 160.0), new Apple("orange", 122.0));
		PredicateDemo.filterApples(apples, PredicateDemo.isWeightAbove100()).forEach(System.out::println);
	}
}



