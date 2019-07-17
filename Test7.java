package com.itheima_day05;

/*
 * 百钱买百鸡 : 一百文钱买一百只鸡
 * 公鸡 	5文钱一只
 * 母鸡 	3文钱一只
 * 小鸡	一文钱三只
 * 
 * 公鸡x只
 * 母鸡y只
 * 小鸡z只
 * 
 *  x + y + z = 100只
 *  5*x + 3*y + z/3 = 100文钱
 * 
 * 求公鸡母鸡小鸡的数量 : 答案有四个	
 * 
 * 
	公鸡数量为:0,母鸡数量为:25,小鸡数量为:75
	公鸡数量为:4,母鸡数量为:18,小鸡数量为:78
	公鸡数量为:8,母鸡数量为:11,小鸡数量为:81
	公鸡数量为:12,母鸡数量为:4,小鸡数量为:84


 */
public class Test7 {
	public static void main(String[] args) {

		for (int x = 0; x <= 20; x++) {
			for (int y = 0; y <= 33; y++) {
				int z = 100 - x - y;
				
				if(5 * x + 3 * y + z/3.0 == 100){
					System.out.print("公鸡数量为:"+x);
					System.out.print(",母鸡数量为:"+y);
					System.out.println(",小鸡数量为:"+z);
				}
			}
		}
	}
}
