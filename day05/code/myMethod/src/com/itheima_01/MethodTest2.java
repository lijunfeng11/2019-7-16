package com.itheima_01;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ��Ƚ����������Ƿ����
 * 
 * 
 *     ����һ�������ж����������Ƿ����
		Ҫ��1.��ע����д������
		          2.��ע������ȷ����ֵ������ʲô
		          3.��ע������ȷ�����б���ʲô



	���� : ����һ������,�����Ĺ�����,�ȿ��Է����������������ֵ,Ҳ�ܷ���������������Сֵ.
 */
public class MethodTest2 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ��ȡ����
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();

		// ���÷���(�˼ҷ���ʲô�������ͣ���͸���ʲô�������ͽ���)
		boolean b = compare(x, y);

		// ������
		System.out.println("b:" + b);
	}

	/*
	 * �Ƚ����������Ƿ����
	 * 
	 * ������ȷ�� ����ֵ���ͣ�boolean �����б�int a,int b
	 */
	public static boolean compare(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
		
	}
}
