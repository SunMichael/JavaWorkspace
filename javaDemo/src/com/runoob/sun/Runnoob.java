package com.runoob.sun;

import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
//import java.util.regex.Pattern;

import javaDemo.Employee;  //不同包之间的类调用 使用import

public class Runnoob {
	Employee one;
	public static void main(String[] args) {
	   func();
	}
	public static void func() {
		String string = "runnoob";
		string = "i am".concat(string);
		String sub = string.substring(2, 5);
		System.out.println("大写：" + sub.toUpperCase());
		
		//修改string 使用stringbuffer操作
		StringBuffer buffer = new StringBuffer("newbuffer");
		buffer = buffer.insert(3, "ccc");
		buffer = buffer.delete(0, 3);
		System.out.println("bufferString：" + buffer.toString());
		
		
		//array
		double[] list = {1,2,3,4};
		list[1] = 1;
		
//		String[] ary = {"A", "B"};
		
		Object array = Array.newInstance(int.class, 4);
		Array.set(array, 1 , 1);
		
	}
	
	public static <T> void printArray( T[] inputary) {
		for(T item: inputary ) {
			System.out.println("打印元素:" + item);
		}
	}
	
	void dataStruct() {
//		int[] ary = {1, 2, 3};
//		printArray(ary);
		
		Enumeration<String> days;    //枚举
		Vector<String> dayNames = new Vector<String>();   //向量，和ArrayList类似，可动态改大小
		dayNames.add("Sunday");
		dayNames.add("Monday");
		days = dayNames.elements();
		while(days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("keyq", "one");
		map.put("key2", "two");
		System.out.println("map所有键: \n 所有值" + map.keySet() + "\n 所有值:" + map.values());

	}
	
	
	
}








