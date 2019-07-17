package com.itheima_day05;

import java.util.Scanner;

/*
 * 方法练习之在控制台打印1到n的数据
 *
 */
public class VoidMethod2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("录入一个整数:");
		int n = sc.nextInt();
		
		// 单独调用
		printNum(n);
	}
	/*
	 *  两个明确 
	 *  	返回值类型 : void
	 *  	参数列表 : int n
	 */
	public static void printNum(int n) {
		if (n >= 1) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}else {
			for (int i = 1; i >= n; i--) {
				System.out.println(i);
			}
		}

	}
}
