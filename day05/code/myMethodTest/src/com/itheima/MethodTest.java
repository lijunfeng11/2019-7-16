package com.itheima;
/*
 * 需求：把遍历数组改进为方法实现，并调用方法
 */
public class MethodTest {
	public static void main(String[] args) {
		//定义数组
		int[] arr1 = {11,22,33,44,55};
		
		//调用方法
		//printArray(arr);
		
		//我们已经实现了需求，但是我觉得这个效果不好看，我想要如下的效果可以吗
		//[元素1, 元素2, 元素3, ...]
		//我们的结果应该是这样的：[11, 22, 33, 44, 55]
		printArray(arr1);
	}
	
	/*
		定义数组int arr = {1,2,3,4,5,6}
		定义一个方法打印数组的内容
		要求：
		1.确定方法的参数列表
		2.确定方法的返回值类型
		3.打印结果为 [1,2,3,4,5,6]
	*/
	/*
	 * 遍历数组的方法。
	 * 两个明确：
	 * 		返回值类型：void
	 * 		参数列表：int[] arr
	 */
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			//判断是否是最后一个元素
			if(x == arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}	
		}
		//System.out.println("]");
	}
}
