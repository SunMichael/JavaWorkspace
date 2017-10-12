package com.runoob.sun;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) {
		serializeFunc();
		deserializeFunc();
	}
	
	public static void serializeFunc() {
		User user = new User();
		user.address = "hz";
		user.name = "tom";
		user.age = 24;
		try {
			//先filestream 后初始化object write close
			FileOutputStream fileOut = new FileOutputStream("/tmp/user.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(user);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved");
			
		}catch(IOException e){
			
		}
	}
	
	public static void deserializeFunc() {
		User user = null;
		try {
			FileInputStream fileIn = new FileInputStream("/tmp/user.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			user = (User) in.readObject();
			System.out.println("user:" + user);
			in.close();
			fileIn.close();
		}catch(IOException e) {
			
		}catch(ClassNotFoundException c) {
			
		}
	}
	
	
}


class User implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	public int age;
	public void sayHello() {
		System.out.println(name + "say hello");
	}
	
}
