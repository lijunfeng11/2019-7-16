package com.itheima_01;

/*
 * �����ĵ��ã�(����ȷ����ֵ�ķ����ĵ���)
 * 		A:�������ã�û������
 * 		B:��ֵ����(�����Ƽ��ķ�ʽ)
 * 		C:�������
 * 
 *  ���������е��������������͵ķ���
	Ҫ��ʹ��int�������ݽ��ս��
	          ʹ���������ӡ�ý��

 */
public class MethodDemo2 {
	public static void main(String[] args) {
		// ��ε��÷�����?
		// ����Ӧ�ø��ݷ�����������
		// sum();
		// ���÷�����������Ҫ������������Ҫ�������Ĳ���(����������)
		// sum(10,20);

		// ��Ϊ�÷���������һ��int���͵�ֵ����������Ӧ����һ��int���͵ı�������
		// int x = 10;
		// int y = 20;
		int result = sum(10, 20);//30
		System.out.println("result:" + result);

		// �������
		// System.out.println(sum(10,20));
	}

	/**
	 * ���������ݺ͵ķ���
	 * ����ֵ���� int
	 * �����б� int a,int b
	 */
	public static int sum(int a, int b) {// int a =10,int b =20
		int c = a + b;
		return c;
	}
}
