package com.exc17_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateWordRemoval {



	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<>();
		createMap(myMap);
		displayMap(myMap);
	}

	private static void createMap(Map<String,Integer> map)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a string: ");
		String input = sc.nextLine();
		String[] tokens = input.split(" ");
		for(String token: tokens)
		{
			String word = token.toLowerCase();
			if(map.containsKey(word))
			{
				int count = map.get(word);
				map.put(word, count+1);
			}
			else
				map.put(word,1);
		}
		sc.close();
	}
	
	private static void displayMap(Map<String,Integer> map)
	{
		Set<String> keys = map.keySet();
		TreeSet<String> sortedKeys = new TreeSet<>(keys);
		
		System.out.println("Unique words in the sentence are: ");
		
		for(String key : sortedKeys)
		{
			if(map.get(key)==1)
			System.out.printf("%s ",key);
		}
	}

}
