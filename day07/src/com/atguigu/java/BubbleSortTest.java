package com.atguigu.java;

public class BubbleSortTest {

	public static void main(String[] args) {
		int[] arr = new int[16];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 90 + 10);
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n*******************");
		bubbleSort(arr);
		//Print result
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	private static int[] bubbleSort(int[] arr){
		
		if(arr == null || arr.length == 0){
			return null;
		}
		
		//Outer loop, arr.length - 1 times
		int temp;
		for(int i = 0; i < arr.length - 1; i++){
			//Inner loop, find the maximum each time
			for(int j = 0; j < arr.length -1 - i; j++){
				
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		return arr;
	}

}
