package com.DuplicateIntegersFromTheList.Duplicates;

import java.util.*;

public class Duplicates {
	public static List<Integer> findDuplicates(List<Integer> numbers){
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		for (Integer num : numbers) {
			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}
		
		return new ArrayList<>(duplicates);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter integers seperated by space :");
		String input = scanner.nextLine();
		
		String[] inputarray = input.split("\\s");
		
		List<Integer> numbers = new ArrayList<>();
		
		for (String s : inputarray) {
			numbers.add(Integer.parseInt(s));
		}
		
		List<Integer> duplicates = findDuplicates(numbers);
		
		if (duplicates.isEmpty()) {
			System.out.println("No duplicates found");
		}
		else {
			System.out.println("Duplicate integers : "+duplicates);
		}
		scanner.close();
	}

}
