package com.itheima_day05;

import java.util.Scanner;

/*
 * 方法练习之求三个数据较大值, 三个数据采用键盘录入
 */
public class MethodTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("录入第一个数据:");
		int a = sc.nextInt();
		
		System.out.println("录入第二个数据:");
		int b = sc.nextInt();
		
		System.out.println("录入第三个数据:");
		int c = sc.nextInt();
		
		// 赋值调用
		int max = getMax(a, b, c);
		
		System.out.println("三个数据的最大值为:"+max);
	}
	
	/*
	 * 两个明确
	 * 	返回值类型 : int
	 * 	参数列表 : int a , int b , int c  
	 */
	public static int getMax(int a , int b , int c){
		// 求ab中的最大值
		int temp = a > b ? a : b ;
		
		// 求abc中的最大值
		int max = temp > c ? temp : c;
		
		return max;
	}

}
