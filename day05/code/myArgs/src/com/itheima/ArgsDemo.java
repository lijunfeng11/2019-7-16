package com.itheima;

/*
 * ����������Ϊ�����Ĳ�������ʽ�����ĸı䲻Ӱ��ʵ�ʲ�����
 * 
 * ��ʽ���������ڽ���ʵ�ʲ����ı���
 * ʵ�ʲ�����ʵ�ʲ������������
 */
public class ArgsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a:" + a + ",b:" + b);
		change(a, b);
		System.out.println("a:" + a + ",b:" + b);
	}

	public static void change(int a, int b) {
		System.out.println("a:" + a + ",b:" + b);
		a = b;
		b = a + b;
		System.out.println("a:" + a + ",b:" + b);
	}

}
