package com.hackerrank.array.zigzag;

import java.util.Scanner;

public class Solution {

	private static void printZigZag(int[][] matrix, int totalRows, int totalCols) {
		for (int row = 0; row < totalRows; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < totalCols; col++) {
					System.out.print(matrix[row][col] + " ");
				}
			} else {
				for (int col = totalCols - 1; col >= 0; col--) {
					System.out.print(matrix[row][col] + " ");
				}
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows;
		int cols;
		int[][] matrix;

		try {
			rows = sc.nextInt();
			cols = sc.nextInt();

			matrix = new int[rows][cols];

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
		} finally {
			sc.close();
		}

		printZigZag(matrix, rows, cols);
	}
}