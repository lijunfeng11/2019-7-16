package com.itheima_day05;
/*
 *  方法的格式 :
 *  
 *  	A :  有具体返回值方法的格式
 *  
 *  		修饰符   返回值类型  方法名(数据类型  变量名 , 数据类型  变量名 ...){
 *  			方法体;
 *  			return 返回值;
 *  		}
 *  
 *  		 调用 : 1 单独调用(没有意义)	2 赋值调用(推荐方式)	 	3  输出调用
 *  
 *  
 *  	B :  无具体返回值方法的格式(用void修饰的方法)
 *  
 *  		修饰符  void 方法名(数据类型  变量名 , 数据类型  变量名 ...){
 *  			方法体;
 *  		}
 *  
 *  		调用 : 1 单独调用
 * 
 */
public class MethodTest1 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;

		// 赋值调用
		int max = getMax(x, y);
		System.out.println("两个数据的最大值为:"+max);
		
		System.out.println("------------------");
		
		// 输出调用
		System.out.println("两个数据的最大值为:"+getMax(x, y));
	}

	/*
	 * 求两个数据的最大值
	 * 两个明确 
	 * 		返回值类型 : int
	 * 		参数列表 : int a, int b
	 */
	public static int getMax(int a , int b ){
		int max = a > b ? a : b;
		return max;
	}
}
