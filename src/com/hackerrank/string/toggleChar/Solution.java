/**
 * 
 */
package com.hackerrank.string.toggleChar;

import java.util.Scanner;

/**
 * 
 */
public class Solution {

	private static String toggleChar(String line) {
		char[] output = new char[line.length()];

		for (int i = 0; i < line.length(); i++) {
			int currCharCode = (int) line.charAt(i);

			if (currCharCode >= 97) {
				currCharCode = 65 + (currCharCode - 97);
			} else {
				currCharCode = 97 + (currCharCode - 65);
			}

			output[i] = (char) currCharCode;
		}

		return new StringBuilder().append(output).toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		System.out.println(toggleChar(line));

		sc.close();
	}

}
