package com.sufyan97.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumStream {
	private static List<Integer> listInteger = new ArrayList<>();
	
	private static void generateList() {
		if(listInteger == null || listInteger.isEmpty()) {
			Integer[] arrInt = {10, 20, 15, 35, 25, 50};
			listInteger = Arrays.asList(arrInt);
		}
	}
	
	private static Integer nativeSumIndex() {
		Integer sum = 0;
		for(int i = 0; i < listInteger.size(); i++) {
			sum += listInteger.get(i);
		}
		return sum;
	}
	
	private static Integer nativeSum() {
		Integer sum = 0;
		for(Integer num : listInteger) {
			sum += num;
		}
		return sum;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		generateList();
		
		// native 
		System.out.println(nativeSumIndex());
		System.out.println(nativeSum());
		
		// reduce 
		System.out.println("menggunakan reduce");
		System.out.println(listInteger.stream().reduce(0, (a, b) -> a + b));
		System.out.println(listInteger.stream().reduce(0, Integer::sum));
		System.out.println(listInteger.stream().reduce(0, SumStream::add));
		
		// collect
		System.out.println("menggunakan collect");
		System.out.println(listInteger.stream()
				.collect(
						Collectors.summingInt(Integer::intValue)
						)
				);
		
		//mapToInt
		System.out.println("menggunakan mapToInt ");
		System.out.println(listInteger.stream().mapToInt(Integer::intValue).sum());
		System.out.println(listInteger.stream().mapToInt(Integer::valueOf).sum());
	}
	
	
	
}
