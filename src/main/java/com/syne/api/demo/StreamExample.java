package com.syne.api.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100000; i++)myList.add(i);

		
		  //parallel stream 
		  long startTimePar = System.currentTimeMillis();
		  Stream<Integer> parallelStream = myList.parallelStream(); 
		  Stream<Integer> highNums = parallelStream.filter(p -> p > 99990); //using lambda in forEach
		  highNums.forEach(p -> System.out.println("High Nums parallel=" + p)); 
		  long endTimePar = System.currentTimeMillis();
		  System.out.println("Time Taken for Parallel process :: " + (endTimePar - startTimePar));
		  
		  
		  //sequential stream 
		  long startTimeSeq = System.currentTimeMillis();
		  Stream<Integer> sequentialStream = myList.stream(); 
		  Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 99990); 
		  highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p)); 
		  long endTimeSeq = System.currentTimeMillis();
		  System.out.println("Time Taken for sequencial process :: " + (endTimeSeq - startTimeSeq));

	}

}
