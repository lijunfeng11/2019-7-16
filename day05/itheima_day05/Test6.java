package com.itheima_day05;

/*
 * ��ά���� :
 * 		��̬��ʼ��
 * 			��������[][] ������ = new ��������[һά����ĸ���][һά������Ԫ�صĸ���];
 * 			int[][] arr = new int[2][3];
 * 		��̬��ʼ��
 * 			��������[][] ������ = new ��������[][]{{Ԫ��1,Ԫ��2,Ԫ��3...},{Ԫ��1,Ԫ��2,Ԫ��3...},{Ԫ��1,Ԫ��2,Ԫ��3...}...};
 *			��������[][] ������ = {{Ԫ��1,Ԫ��2,Ԫ��3...},{Ԫ��1,Ԫ��2,Ԫ��3...},{Ԫ��1,Ԫ��2,Ԫ��3...}...};
 *			int[][] arr = { {1,2,3} , {4,5,6} , {7,8,9}};
 */
public class Test6 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 10, 11 }, { 7, 8, 9 } };

		System.out.println(arr);// ��ӡ���ǵ�ֵַ
		System.out.println(arr.length);

		// ��ά����ı���
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		for (int x = 0; x < arr[0].length; x++) {
			System.out.println(arr[0][x]);
		}

		for (int x = 0; x < arr[1].length; x++) {
			System.out.println(arr[1][x]);
		}

		for (int x = 0; x < arr[2].length; x++) {
			System.out.println(arr[2][x]);
		}

		System.out.println("--------------");

		for (int i = 0; i < arr.length; i++) {// �����м���һά����
			for (int x = 0; x < arr[i].length; x++) {// ÿ��һά�����е�Ԫ��
				System.out.print(arr[i][x] + " ");
			}
			System.out.println();
		}
	}

}
