package com.hackerrank.array.colwise;

import java.util.Scanner;

public class Solution {

	private static void printColWise(int[][] matrix, int totalRows, int totalCols) {
		for (int col = 0; col < totalCols; col++) {
			for (int row = 0; row < totalRows; row++) {
				System.out.print(matrix[row][col] + " ");
			}

			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalRows, totalCols;
		int[][] matrix;

		try {
			totalRows = sc.nextInt();
			totalCols = sc.nextInt();
			matrix = new int[totalRows][totalCols];

			for (int row = 0; row < totalRows; row++) {
				for (int col = 0; col < totalCols; col++) {
					matrix[row][col] = sc.nextInt();
				}
			}
		} finally {
			sc.close();
		}

		printColWise(matrix, totalRows, totalCols);
	}

}
