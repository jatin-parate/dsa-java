package com.hackerrank.string.palindrome;

import java.util.Scanner;

public class Solution {

	private static char toSmallCase(char c) {
		int charCode = (int) c;

		if (charCode >= 97) {
			return (char) (65 + (charCode - 97));
		}

		return c;
	}

	private static boolean isPalindrome(String line) {
		final int n = line.length();

		int left = 0, right = n - 1;
		char leftCharCode, rightCharCode;

		while (left <= right) {
			leftCharCode = toSmallCase(line.charAt(left));
			rightCharCode = toSmallCase(line.charAt(right));

			if (leftCharCode != rightCharCode) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		System.out.println(Boolean.toString(isPalindrome(line)));

		sc.close();
	}

}
