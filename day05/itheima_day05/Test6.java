package com.itheima_day05;

/*
 * 二维数组 :
 * 		动态初始化
 * 			数据类型[][] 数组名 = new 数据类型[一维数组的个数][一维数组中元素的个数];
 * 			int[][] arr = new int[2][3];
 * 		静态初始化
 * 			数据类型[][] 数组名 = new 数据类型[][]{{元素1,元素2,元素3...},{元素1,元素2,元素3...},{元素1,元素2,元素3...}...};
 *			数据类型[][] 数组名 = {{元素1,元素2,元素3...},{元素1,元素2,元素3...},{元素1,元素2,元素3...}...};
 *			int[][] arr = { {1,2,3} , {4,5,6} , {7,8,9}};
 */
public class Test6 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 10, 11 }, { 7, 8, 9 } };

		System.out.println(arr);// 打印的是地址值
		System.out.println(arr.length);

		// 二维数组的遍历
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		for (int x = 0; x < arr[0].length; x++) {
			System.out.println(arr[0][x]);
		}

		for (int x = 0; x < arr[1].length; x++) {
			System.out.println(arr[1][x]);
		}

		for (int x = 0; x < arr[2].length; x++) {
			System.out.println(arr[2][x]);
		}

		System.out.println("--------------");

		for (int i = 0; i < arr.length; i++) {// 遍历有几个一维数组
			for (int x = 0; x < arr[i].length; x++) {// 每个一维数组中的元素
				System.out.print(arr[i][x] + " ");
			}
			System.out.println();
		}
	}

}
