package com.itheima_day05;

/*
 * �����Ĳ�������������������� , �βεĸı�ֱ��Ӱ��ʵ�ε�ֵ
 * ԭ��: ���ݵ��ǵ�ֵַ
 */
public class Test3 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		test2(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void test2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] = arr[i] + 10;
			}
		}
	}

}
