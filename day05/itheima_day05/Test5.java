package com.itheima_day05;
/*
 * 方法练习之数组获取最值
 */
public class Test5 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 4 };
		
		int max = getMax(arr);
		System.out.println("数组的最大值为:"+max);
		
		int min = getMin(arr);
		System.out.println("数组的最小值为:"+min);
		
		System.out.println("-------------");
		
		int maxOrMin1 = getMaxOrMin(arr, true);
		System.out.println("数组的最大值为:"+maxOrMin1);
		
		int maxOrMin2 = getMaxOrMin(arr, false);
		System.out.println("数组的最大值为:"+maxOrMin1);
		
		
		System.out.println("-------------");
		
		String maxOrMin = getMaxOrMin(arr);
		System.out.println(maxOrMin);
		
		System.out.println("-------------");
		
		int[] maxOrMin22 = getMaxOrMin2(arr);
		System.out.println("数组的最大值为:"+maxOrMin22[0]);
		System.out.println("数组的最大值为:"+maxOrMin22[1]);
		
	}
	
	/**
	 * 此方法用来获取int类型数组的最大值
	 * @param arr
	 * 		代表的是int类型的数组
	 * @return
	 * 		传入的数组最大值
	 */
	public static int getMax(int[] arr){
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		return max;
	}
	
	/*
	 * 两个明确
	 * 	返回值类型 : int
	 * 	参数列表 : int[] arr
	 */
	public static int getMin(int[] arr){
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		return min;
	}
	
	
	public static int getMaxOrMin(int[] arr , boolean flag){// { 3, 2, 1, 5, 4 }   false
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		if (flag) {
			return max;
		} else {
			return min;
		}
	}
	
	public static String getMaxOrMin(int[] arr){
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return "数组的最大值为 :" + max + ",最小值为 :" + min;
	}
	
	public static int[] getMaxOrMin2(int[] arr){
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return  new int[]{max , min};
	}
}
