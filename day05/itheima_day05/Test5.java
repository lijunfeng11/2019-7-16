package com.itheima_day05;
/*
 * ������ϰ֮�����ȡ��ֵ
 */
public class Test5 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 4 };
		
		int max = getMax(arr);
		System.out.println("��������ֵΪ:"+max);
		
		int min = getMin(arr);
		System.out.println("�������СֵΪ:"+min);
		
		System.out.println("-------------");
		
		int maxOrMin1 = getMaxOrMin(arr, true);
		System.out.println("��������ֵΪ:"+maxOrMin1);
		
		int maxOrMin2 = getMaxOrMin(arr, false);
		System.out.println("��������ֵΪ:"+maxOrMin1);
		
		
		System.out.println("-------------");
		
		String maxOrMin = getMaxOrMin(arr);
		System.out.println(maxOrMin);
		
		System.out.println("-------------");
		
		int[] maxOrMin22 = getMaxOrMin2(arr);
		System.out.println("��������ֵΪ:"+maxOrMin22[0]);
		System.out.println("��������ֵΪ:"+maxOrMin22[1]);
		
	}
	
	/**
	 * �˷���������ȡint������������ֵ
	 * @param arr
	 * 		�������int���͵�����
	 * @return
	 * 		������������ֵ
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
	 * ������ȷ
	 * 	����ֵ���� : int
	 * 	�����б� : int[] arr
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

		return "��������ֵΪ :" + max + ",��СֵΪ :" + min;
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
