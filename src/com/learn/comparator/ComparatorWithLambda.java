package com.learn.comparator;

import java.util.ArrayList;
import java.util.List;

public class ComparatorWithLambda {

	private static List<Developer> getDevelopers() {
		List<Developer> developers = new ArrayList<>();
		developers.add(new Developer("ravi", 70000d, 33));
		developers.add(new Developer("john", 80000d, 20));
		developers.add(new Developer("siva", 100000d, 10));
		developers.add(new Developer("iris", 170000d, 55));
		
		return developers;
	}
	
	public static void main(String[] args) {
		
		List<Developer> developers = getDevelopers();
		
		System.out.println("Before Sorting");
		for(Developer developer : developers) {
			System.out.println(developer);
		}
		
		System.out.println("After Sorting");
		
		System.out.println("############ Sort By Age....");
		developers.sort((Developer d1, Developer d2) -> d1.getAge() - d2.getAge());		
		developers.forEach((developer) -> System.out.println(developer));
		
		System.out.println("############ Sort By Name....");
		developers.sort((d1, d2) -> d1.getDevName().compareTo(d2.getDevName()));		
		developers.forEach((developer) -> System.out.println(developer));
		
		System.out.println("############ Sort By Salary....");
		developers.sort((d1, d2) -> d1.getSalary().compareTo(d2.getSalary()));		
		developers.forEach((developer) -> System.out.println(developer));
	}

}
