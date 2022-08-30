package com.atguigu.exer;

public class RandomValueTest {

	public static void main(String[] args) {
		int[] arr = new int[6];
		boolean[] used = new boolean[31];
		
		int tmp;
		for(int i = 0; i < arr.length; i++){
			tmp = (int)(Math.random() * 30) + 1;
			while(used[tmp]){
				tmp = (int)(Math.random() * 30) + 1;
			}
			arr[i] = tmp;
			used[tmp] = true;
			System.out.print(arr[i] + "\t");
		}

	}

}
