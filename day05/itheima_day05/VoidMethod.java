package com.itheima_day05;
/*
 * ������ϰ֮�ڿ���̨��ӡ���е�ˮ�ɻ���
 */
public class VoidMethod {
	public static void main(String[] args) {
		// ��������
		printFlower();
	}
	
	/*
	 * ������ȷ 
	 * 	����ֵ���� : void
	 * 	�����б� : ��
	 */
	public static void printFlower(){
		for (int i = 100; i < 1000; i++) {
			int ge  = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				System.out.println(i);
			}
		}
	}

}
