package com.hackerrank.string.reverseString;

import java.util.Scanner;

public class Solution {

	private static String reverseString(String line) { 
		char[] outputArr = new char[line.length()];

		for (int i = line.length() - 1; i >= 0; i--) {
			outputArr[line.length() - i - 1] = line.charAt(i);
		}

		return new StringBuilder(line.length()).append(outputArr).toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		System.out.println(reverseString(line));
		sc.close();
	}

}
