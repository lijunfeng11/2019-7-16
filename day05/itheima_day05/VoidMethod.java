package com.itheima_day05;
/*
 * 方法练习之在控制台打印所有的水仙花数
 */
public class VoidMethod {
	public static void main(String[] args) {
		// 单独调用
		printFlower();
	}
	
	/*
	 * 两个明确 
	 * 	返回值类型 : void
	 * 	参数列表 : 无
	 */
	public static void printFlower(){
		for (int i = 100; i < 1000; i++) {
			int ge  = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				System.out.println(i);
			}
		}
	}

}
