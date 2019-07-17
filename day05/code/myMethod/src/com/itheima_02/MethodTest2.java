package com.itheima_02;

/*
 * 需求：写一个方法，打印1到n之间的数据(n是调用的时候传递过来的)
 * 隐含：n>=1
 
 
 
 
 
   	定义一个方法传递一个整数（该整数大于1），在控制台打印1到该数据的值
	要求：	1.注释中写明需求
	 	    2.注释中明确返回值类型和参数列表
	
	调用该方法，可以在控制台显示打印结果

 */
public class MethodTest2 {
	public static void main(String[] args) {
		// 调用方法
		printNumber(3);
		System.out.println("------------");
		printNumber(5);

	}

	/*
	 * 打印1到n之间的数据(n是调用的时候传递过来的)
	 * 
	 * 两个明确： 
	 * 		返回值类型：void 
	 * 		参数列表：int
	 */
	public static void printNumber(int n) {
		for (int x = 1; x <= n; x++) {
			System.out.println(x);
		}
	}
}
