package com.itheima_01;

/*
 * 方法的调用：(有明确返回值的方法的调用)
 * 		A:单独调用，没有意义
 * 		B:赋值调用(我们推荐的方式)
 * 		C:输出调用
 * 
 *  在主方法中调用求两个整数和的方法
	要求：使用int类型数据接收结果
	          使用输出语句打印该结果

 */
public class MethodDemo2 {
	public static void main(String[] args) {
		// 如何调用方法呢?
		// 我们应该根据方法名来调用
		// sum();
		// 调用方法，不仅仅要看方法名，还要看方法的参数(个数和类型)
		// sum(10,20);

		// 因为该方法返回了一个int类型的值，所以我们应该用一个int类型的变量接收
		// int x = 10;
		// int y = 20;
		int result = sum(10, 20);//30
		System.out.println("result:" + result);

		// 输出调用
		// System.out.println(sum(10,20));
	}

	/**
	 * 求两个数据和的方法
	 * 返回值类型 int
	 * 参数列表 int a,int b
	 */
	public static int sum(int a, int b) {// int a =10,int b =20
		int c = a + b;
		return c;
	}
}
