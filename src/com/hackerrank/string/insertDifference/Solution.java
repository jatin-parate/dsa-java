package com.hackerrank.string.insertDifference;

import java.util.Scanner;

public class Solution {

	private static String insertDifference(String line) {
		StringBuilder sb = new StringBuilder();

		int j = 0;
		for (int i = 0; i < line.length(); i++) {
			char currChar = line.charAt(i);
			sb.append(currChar);

			if (i != line.length() - 1) {
				char nextChar = line.charAt(i + 1);
				int abs = (((int) nextChar) - ((int) currChar));
				sb.append(Integer.toString(abs));
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		System.out.println(insertDifference(line));

		sc.close();
	}

}
