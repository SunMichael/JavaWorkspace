
package javaDemo;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Hello {

	public static void main (String []args) {
		System.out.print("Hello world \n");
		
		Employee tom = new Employee("tom");
		tom.empAge(25);
		tom.empSalary(1000.00);
		tom.printInfor();
		
		Employee.func();
		
		
		String[] names = {"one", "two", "three" };
		for(String name : names) {
			System.out.println(name);
		}
		
		//Math 
		System.out.println("Math: " + Math.PI);
		System.out.println("Math: " + Math.max(1, 5));
		System.out.println("Math: " + Math.sin(0.5));
		Integer num = Integer.valueOf("10");
		System.out.println(num);
		num.toString();
		
		Date date = new Date();
		System.out.println("时间字符："+ date.toString());
		System.out.println("时间戳："+ date.getTime());
		SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss "); //E是星期 
		System.out.println("时间格式："+ ft.format(date));
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("输入字符，按q键退出");
//		char c = 0;
//		do {
//			c = (char)br.read();
//			System.out.println(c);
//		}while (c != 'q');
		
		String content = "abcdefghjkl ";
		boolean ismatch = Pattern.matches(".*abc.*", content);
		System.out.println("匹配结果:"+ ismatch);
		
		try {  //try里的代码可能会抛出异常
			int[] a = new int[2];
			int b = a[3];
			System.out.println(b);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("expection throw" + e);
		}
		
		scan = new Scanner(System.in);
		if (scan.hasNext()) {
			String str = scan.next();
			System.out.println("输出数据:" + str);
		}
	}
	
	final double money = 500.00;
	private static Scanner scan;
	
}
