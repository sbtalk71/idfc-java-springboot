package com.demo.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(1,2,4,5,6,10,12,15,16,17,18,19,20);
		
		numList.stream().filter(num->num%2==0).forEach(num->System.out.println(num));
		
		List<Integer> even=numList.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		numList.stream().filter(num->num%2==0).map(num->num+2).forEach(num->System.out.println(num));
		
		System.out.println(numList.stream().filter(num->num%2==0).mapToInt(num->num.intValue()).sum());
		
		
		
		List<Integer> sortedList=numList.stream().sorted((num1,num2)->num2.compareTo(num1)).collect(Collectors.toList());
		System.out.println(sortedList);
		
	}

}
