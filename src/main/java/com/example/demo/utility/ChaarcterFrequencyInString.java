package com.example.demo.utility;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class  ChaarcterFrequencyInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("sandeep");
		
		
		String s ="sandeep";
		
	
		Map<Character, Long> map = s.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        map.forEach((character, count) -> 
            System.out.println(character + ": " + count));
		
	}

}
