package com.hackerrank.array.rowwise;

import java.util.Scanner;

public class Solution {
	private static void printRowWise(int[][] matrix, int totalRows, int totalCols) {
		for (int row = 0; row < totalRows; row++) {
			for (int col = 0; col < totalCols; col++) {
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

		printRowWise(matrix, totalRows, totalCols);
	}

}
