package com.itheima_02;

/*
 * 需求：写一个方法，把所有的水仙花数打印在控制台
 * 
 * 
   	定义一个方法，打印100-999之间水仙花数
	要求：注释中写明需求
	          注释中写明方法的返回值类型
	          注释中写明方法的参数类型及个数
	主方法中调用该方法，控制台输出水仙花数
 */
public class MethodTest {
	public static void main(String[] args) {
		// 调用方法
		printFlower();
	}

	/*
	 * 把所有的水仙花数打印在控制台
	 * 
	 * 两个明确： 
	 * 		返回值类型：void 
	 * 		参数列表：无
	 */
	public static void printFlower() {
		for (int x = 100; x < 1000; x++) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 10 / 10 % 10;

			if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == x) {
				System.out.println(x);
			}
		}
	}

	/*
	 * 返回值类型:int 
	 * 参数列表:无
	 */
	public static int printFlower1() {
		int count = 0;

		for (int x = 100; x < 1000; x++) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 10 / 10 % 10;

			if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == x) {
				count++;
			}
		}
		return count;
	}

}
