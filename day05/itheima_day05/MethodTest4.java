package com.itheima_day05;

import java.util.Scanner;

/*
 * ������ϰ֮�Ƚ����������Ƿ���� , ����¼����������
 */
public class MethodTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¼���һ������:");
		int a = sc.nextInt();
		
		System.out.println("¼��ڶ�������:");
		int b = sc.nextInt();
		
		// ��ֵ����
		boolean bb = compare(a, b);
		
		if(bb){
			System.out.println("�������!");
		}else{
			System.out.println("���ݲ����!");
		}
		
	}
	
	/*
	 * ������ȷ 
	 * 	����ֵ���� : boolean
	 * 	�����б� : int a, int b
	 */
	public static boolean compare(int a, int b) {
		if (a == b) {
			return true;
		}else{
			return false;
		}
	}

}
