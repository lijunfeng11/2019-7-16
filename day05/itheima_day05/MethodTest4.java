package com.itheima_day05;

import java.util.Scanner;

/*
 * 方法练习之比较两个数据是否相等 , 键盘录入两个数据
 */
public class MethodTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("录入第一个数据:");
		int a = sc.nextInt();
		
		System.out.println("录入第二个数据:");
		int b = sc.nextInt();
		
		// 赋值调用
		boolean bb = compare(a, b);
		
		if(bb){
			System.out.println("数据相等!");
		}else{
			System.out.println("数据不相等!");
		}
		
	}
	
	/*
	 * 两个明确 
	 * 	返回值类型 : boolean
	 * 	参数列表 : int a, int b
	 */
	public static boolean compare(int a, int b) {
		if (a == b) {
			return true;
		}else{
			return false;
		}
	}

}
