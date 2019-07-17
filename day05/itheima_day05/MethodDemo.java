package com.itheima_day05;

public class MethodDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		arr[1] = arr[1] * 10;

		printArr(arr);
		
		
		arr[2] = arr[2] * 10;

		printArr(arr);

		arr[4] = arr[4] * 10;

		printArr(arr);
	}

	// ±éÀúÊı×é
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

}
