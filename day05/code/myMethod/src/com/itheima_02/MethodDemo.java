package com.itheima_02;
/*
 * ����дһ���������ڿ���̨���10��HelloWorld����
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�void
 * 		�����б�û�в���
 * 
 * ���һ������û����ȷ�ķ���ֵ���ͣ�Ҳ���ܰѷ���ֵ���͵ĵط��ճ�����
 * ����Ӧ��дvoid��ʾ�÷����޷���ֵ���͡�
 * 
 * �������ã�(void���εķ���)
 * 		ֻ�ܵ�������
 */
public class MethodDemo {
	public static void main(String[] args) {
		//��������
		printHelloWorld();
		
		//�������
		//System.out.println(printHelloWorld());
		
		//��ֵ����
		//void v = printHelloWorld();
	}
	
	/*
	 * дһ���������ڿ���̨���10��HelloWorld����
	 * 
	 * ������ȷ��
	 * 		����ֵ���ͣ�void
	 * 		�����б�
	 */
	public static void printHelloWorld() {
		/*
		for(int x=1; x<=10; x++) {
			System.out.println("HelloWorld");
		}
		*/
		
		for(int x=0; x<10; x++) {
			System.out.println("HelloWorld");
		}
	}
}
