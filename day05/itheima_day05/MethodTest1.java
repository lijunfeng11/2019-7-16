package com.itheima_day05;
/*
 *  �����ĸ�ʽ :
 *  
 *  	A :  �о��巵��ֵ�����ĸ�ʽ
 *  
 *  		���η�   ����ֵ����  ������(��������  ������ , ��������  ������ ...){
 *  			������;
 *  			return ����ֵ;
 *  		}
 *  
 *  		 ���� : 1 ��������(û������)	2 ��ֵ����(�Ƽ���ʽ)	 	3  �������
 *  
 *  
 *  	B :  �޾��巵��ֵ�����ĸ�ʽ(��void���εķ���)
 *  
 *  		���η�  void ������(��������  ������ , ��������  ������ ...){
 *  			������;
 *  		}
 *  
 *  		���� : 1 ��������
 * 
 */
public class MethodTest1 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;

		// ��ֵ����
		int max = getMax(x, y);
		System.out.println("�������ݵ����ֵΪ:"+max);
		
		System.out.println("------------------");
		
		// �������
		System.out.println("�������ݵ����ֵΪ:"+getMax(x, y));
	}

	/*
	 * ���������ݵ����ֵ
	 * ������ȷ 
	 * 		����ֵ���� : int
	 * 		�����б� : int a, int b
	 */
	public static int getMax(int a , int b ){
		int max = a > b ? a : b;
		return max;
	}
}
