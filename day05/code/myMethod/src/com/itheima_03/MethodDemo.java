package com.itheima_03;

/*
 * �������أ���ͬһ�����У������˷�������ͬ�������
 * 
 * �������ص��ص㣺
 * 		��������ͬ�������б�ͬ�����������뷵��ֵ�޹ء�
 * 
 * 		�����б�ͬ��
 * 			�����ĸ�����ͬ��
 * 			������Ӧ���������Ͳ�ͬ��
 * 
 * ע�����
 * 		�ڵ��÷�����ʱ��java���������ݷ������������б�Ĳ�ͬ�����ַ�����
 * 
 *  �������ص���������ʵ�ֱȽ����������Ƿ���ȡ�
	Ҫ��
	1.��һ�������Ĳ�������Ϊ����int����
	2.�ڶ��������Ĳ�������Ϊ����double����
	3.��main�����н��в���

 */
public class MethodDemo {
	public static void main(String[] args) {
		// ������������
		int a = 10;
		int b = 20;

		// ���
		int result = sum(a, b);
		System.out.println("result:" + result);

		// �������
		int c = 30;
		// int result2 = sum2(a,b,c);
		int result2 = sum(a, b, c);
		System.out.println("result2:" + result2);
	}

	/*
	 * public static int sum(int x,int y) { return x + y; }
	 */

	public static float sum(float a, float b) {
		return a + b;
	}

	// ���������ݵĺ�
	/*
	 * public static int sum2(int a,int b,int c) { return a + b + c; }
	 */
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	// ���������ݵĺ�
	public static int sum(int a, int b) {
		/*
		 * int c = a + b; return c;
		 */

		return a + b;
	}
}
