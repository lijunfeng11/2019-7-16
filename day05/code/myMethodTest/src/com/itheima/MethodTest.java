package com.itheima;
/*
 * ���󣺰ѱ�������Ľ�Ϊ����ʵ�֣������÷���
 */
public class MethodTest {
	public static void main(String[] args) {
		//��������
		int[] arr1 = {11,22,33,44,55};
		
		//���÷���
		//printArray(arr);
		
		//�����Ѿ�ʵ�������󣬵����Ҿ������Ч�����ÿ�������Ҫ���µ�Ч��������
		//[Ԫ��1, Ԫ��2, Ԫ��3, ...]
		//���ǵĽ��Ӧ���������ģ�[11, 22, 33, 44, 55]
		printArray(arr1);
	}
	
	/*
		��������int arr = {1,2,3,4,5,6}
		����һ��������ӡ���������
		Ҫ��
		1.ȷ�������Ĳ����б�
		2.ȷ�������ķ���ֵ����
		3.��ӡ���Ϊ [1,2,3,4,5,6]
	*/
	/*
	 * ��������ķ�����
	 * ������ȷ��
	 * 		����ֵ���ͣ�void
	 * 		�����б�int[] arr
	 */
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			//�ж��Ƿ������һ��Ԫ��
			if(x == arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}	
		}
		//System.out.println("]");
	}
}
