package com.programcreek.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowlesOfaString {

	public static void main(String[] args) {

		String str = "popipsee";
		revereseVowels(str);
		System.out.println();
		revereseVowelswithoutUsingExtraSpace(str);
	}

	private static void revereseVowels(String str) {

		char[] array = str.toCharArray();

		int start = 0;
		int end = array.length - 1;
		//here we are using list as extra space.
		List<Character> list = new ArrayList<>();
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		list.add('A');
		list.add('E');
		list.add('I');
		list.add('O');
		list.add('U');

		while (start < end) {

			if (!list.contains(array[start])) {
				start++;
				continue;
			}
			if (!list.contains(array[end])) {
				end--;
				continue;
			}

			char temp = array[start];
			array[start++] = array[end];
			array[end--] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	//without using extra space
	private static void revereseVowelswithoutUsingExtraSpace(String str) {

		char[] array = str.toCharArray();

		int start = 0;
		int end = array.length - 1;
		 
		//but we are maintiainig the volwels in  a string
		String vowels = "aeiouAEIOU";
		while (start < end) {

			if (!vowels.contains(String.valueOf(array[start]))) {
				start++;
				continue;
			}
			if (!vowels.contains(String.valueOf(array[end]))) { // c below for better understanding
				end--;
				continue;
			}

			char temp = array[start];
			array[start++] = array[end];
			array[end--] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}

//array[start] or array[end] -- returns character and we are converting character to string using String.valueOf()