package com.itheima;

/*
 * ���󣺰ѻ�ȡ������ֵ�Ľ�Ϊ����ʵ�֣������÷���
 */
public class MethodTest2 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 24, 36, 90, 75, 81 };

		// ���÷���
		int max = getMax(arr);

		// ������
		System.out.println("max:" + max);

	}

	/*
	 * �����ȡ��ֵ�ķ���
	 * 
	 * ������ȷ�� ����ֵ���ͣ�int 
	 * �����б�int[] arr
	 */
	public static int getMax(int[] arr) {
		// ���������
		int max = arr[0];

		// ��������ȡԪ�أ����бȽ�
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}

		return max;
	}
}
