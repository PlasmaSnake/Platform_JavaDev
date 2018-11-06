package com.baeldung;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("OneAndOnly");
		list.add("Derek");
		list.add("Change");
		list.add("factory");
		list.add("justBefore");
		list.add("Italy");
		list.add("Italy");
		list.add("Thursday");
		list.add("");
		list.add("");

		Stream<String> stream = list.stream().filter(element -> element.contains("e"));
		boolean isValid = list.stream().anyMatch(element -> element.contains("h"));
		System.out.println("list contains an element with 'h': " + isValid);
		List<String> resultList = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		stream.forEach(e -> System.out.println(e));
		resultList.forEach(e -> System.out.println(e));
	}

}
