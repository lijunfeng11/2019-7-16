package com.itheima_day05;
/*
 * ������ϰ֮�������
 */
public class Test4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// ��������
		printArr(arr); 
	}
	
	/*
	 * ������ȷ 
	 * 	����ֵ���� : void
	 *	�����б� : int[] arr
	 *
	 *  ��ʽ : [Ԫ��1, Ԫ��2, ...Ԫ��n]
	 */
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		
	}
}
