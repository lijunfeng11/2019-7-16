package com.itheima_day05;

/*
 * �����Ĳ�������ǻ����������� , �βεĸı䲻Ӱ��ʵ�ε�ֵ
 * ԭ�� : ���ݵ�ֵ����ֵ
 * 
 * debug : 1 ���Գ���   2 �鿴�����ִ������
 * 
 * 1 ��ϵ�  (���ﲻ�������)
 * 2 ͨ��debugģʽ���г���
 * 3 �鿴����ִ������
 */
public class Test2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		sum(a, b);

		System.out.println(a);
		System.out.println(b);
	}

	public static void sum(int a, int b) {
		a = a + 10;
		b = b + 20;
		System.out.println(a);
		System.out.println(b);
	}

}
