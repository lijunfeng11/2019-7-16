package com.itheima_day05;

/*
 * 方法的参数如果是基本数据类型 , 形参的改变不影响实参的值
 * 原因 : 传递的值数据值
 * 
 * debug : 1 调试程序   2 查看代码的执行流程
 * 
 * 1 打断点  (哪里不会点哪里)
 * 2 通过debug模式运行程序
 * 3 查看代码执行流程
 */
public class Test2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		sum(a, b);

		System.out.println(a);
		System.out.println(b);
	}

	public static void sum(int a, int b) {
		a = a + 10;
		b = b + 20;
		System.out.println(a);
		System.out.println(b);
	}

}
