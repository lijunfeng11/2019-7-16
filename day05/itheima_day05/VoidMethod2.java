package com.itheima_day05;

import java.util.Scanner;

/*
 * ������ϰ֮�ڿ���̨��ӡ1��n������
 *
 */
public class VoidMethod2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¼��һ������:");
		int n = sc.nextInt();
		
		// ��������
		printNum(n);
	}
	/*
	 *  ������ȷ 
	 *  	����ֵ���� : void
	 *  	�����б� : int n
	 */
	public static void printNum(int n) {
		if (n >= 1) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}else {
			for (int i = 1; i >= n; i--) {
				System.out.println(i);
			}
		}

	}
}
