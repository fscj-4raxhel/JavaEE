package com.atguigu.exer;

import java.util.Scanner;

public class SpiralPrintTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size: ");

		int size = sc.nextInt();

		int[][] arr = new int[size][size];
		boolean[][] visited = new boolean[size][size];
		char[] dirs = new char[] { 'r', 'd', 'l', 'u' };// which direction to go

		int value, row, col, dir;// value: the value to fill, row and col are
									// indices
		row = col = 0;// Initial position is the top left corner
		dir = 0;// Initial direction is moving to the right
		value = 1;// Start filling with 1

		while (value <= size * size) {// determines when to stop filling the
										// squre
			// 1. fill the current position
			arr[row][col] = value++;
			visited[row][col] = true;
			// 2. Move to the next position based on the current direction
			switch (dirs[dir]) {
			case 'r'://moving to the right
				if(col >= size-1 || visited[row][col+1]){//Can't move to the right, turn down
					row++;
					dir++;
					dir %= 4;
				}else{//move to the right.
					col++;
				}
				break;
			case 'd':
				if(row >= size-1 || visited[row+1][col]){//Can't move to the right, turn down
					col--;
					dir++;
					dir %= 4;
				}else{//move to the right.
					row++;
				}
				break;
			case 'l':
				if(col <= 0 || visited[row][col-1]){//Can't move to the right, turn down
					row--;
					dir++;
					dir %= 4;
				}else{//move to the right.
					col--;
				}
				break;
			case 'u':
				if(row <= 0 || visited[row-1][col]){//Can't move to the right, turn down
					col++;
					dir++;
					dir %= 4;
				}else{//move to the right.
					row--;
				}
				break;

			}

		}
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
