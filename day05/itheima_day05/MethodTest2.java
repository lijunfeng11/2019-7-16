package com.itheima_day05;

import java.util.Scanner;

/*
 * ������ϰ֮���������ݽϴ�ֵ, �������ݲ��ü���¼��
 */
public class MethodTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¼���һ������:");
		int a = sc.nextInt();
		
		System.out.println("¼��ڶ�������:");
		int b = sc.nextInt();
		
		System.out.println("¼�����������:");
		int c = sc.nextInt();
		
		// ��ֵ����
		int max = getMax(a, b, c);
		
		System.out.println("�������ݵ����ֵΪ:"+max);
	}
	
	/*
	 * ������ȷ
	 * 	����ֵ���� : int
	 * 	�����б� : int a , int b , int c  
	 */
	public static int getMax(int a , int b , int c){
		// ��ab�е����ֵ
		int temp = a > b ? a : b ;
		
		// ��abc�е����ֵ
		int max = temp > c ? temp : c;
		
		return max;
	}

}
