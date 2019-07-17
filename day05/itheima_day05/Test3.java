package com.itheima_day05;

/*
 * 方法的参数如果是引用数据类型 , 形参的改变直接影响实参的值
 * 原因: 传递的是地址值
 */
public class Test3 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		test2(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void test2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] = arr[i] + 10;
			}
		}
	}

}
