package com.itheima_day05;
/*
 * 方法练习之数组遍历
 */
public class Test4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// 单独调用
		printArr(arr); 
	}
	
	/*
	 * 两个明确 
	 * 	返回值类型 : void
	 *	参数列表 : int[] arr
	 *
	 *  格式 : [元素1, 元素2, ...元素n]
	 */
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
