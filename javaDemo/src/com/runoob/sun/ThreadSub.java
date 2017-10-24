package com.runoob.sun;

import java.io.File;

class SubThread extends Thread {  //继承thread类来实现创建新线程. start时 java虚拟机会调用run方法

	private Thread t;
	private String tName;
	SubThread(String name){
		tName = name;
		System.out.println("creating " + name);
	}
	
	public void run() {
		System.out.println("running " + tName);
		try {
			for (int i = 0 ; i < 5; i++) {
				System.out.println("thread "+ tName + i);
				Thread.sleep(50);		
			}
		}catch (InterruptedException e) {
			System.out.println("catch " + e);
		}
		System.out.println("thread exiting");
	}
	
	public void start() {
		System.out.println("starting "+ tName );
		if (t == null) {
			t = new Thread(this, tName);
			t.start();
		}
	}
}


public class  ThreadSub {
	public static void main (String args[]) {
		SubThread one = new SubThread("one");
		one.start();
		
		String dirname = "/tmp";
		File f1 = new File(dirname);
		if (f1.isDirectory()) {
			System.out.println("目录" + dirname);
			String s[] = f1.list();
			for(int i = 0 ; i < s.length ; i++) {
				File f = new File(dirname + "/" + s[i]);
				if(f.isDirectory()) {
					System.out.println(s[i] + "是文件夹");
				}else {
					System.out.println(s[i] + "是文件");
				}
			}
		}else {
			System.out.println(dirname + " 不是一个目录");
		}
		Car a = Car.audi;
		System.out.println("enum" + a);

		for(Car one1 : Car.values()) {
			System.out.println(one1 + " price " + one1.getPrice());
		}
	}
}


enum Car {
	lamborghini(100), tata(10), audi(50),honda(20) ;
	private int price;
	Car(int p){
		price = p;
	}
	int getPrice() {
		return price;
	}
}



