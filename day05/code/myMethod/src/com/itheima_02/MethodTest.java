package com.itheima_02;

/*
 * ����дһ�������������е�ˮ�ɻ�����ӡ�ڿ���̨
 * 
 * 
   	����һ����������ӡ100-999֮��ˮ�ɻ���
	Ҫ��ע����д������
	          ע����д�������ķ���ֵ����
	          ע����д�������Ĳ������ͼ�����
	�������е��ø÷���������̨���ˮ�ɻ���
 */
public class MethodTest {
	public static void main(String[] args) {
		// ���÷���
		printFlower();
	}

	/*
	 * �����е�ˮ�ɻ�����ӡ�ڿ���̨
	 * 
	 * ������ȷ�� 
	 * 		����ֵ���ͣ�void 
	 * 		�����б���
	 */
	public static void printFlower() {
		for (int x = 100; x < 1000; x++) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 10 / 10 % 10;

			if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == x) {
				System.out.println(x);
			}
		}
	}

	/*
	 * ����ֵ����:int 
	 * �����б�:��
	 */
	public static int printFlower1() {
		int count = 0;

		for (int x = 100; x < 1000; x++) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 10 / 10 % 10;

			if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == x) {
				count++;
			}
		}
		return count;
	}

}
