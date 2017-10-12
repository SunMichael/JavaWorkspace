
package javaDemo;    
import javaDemo.SportInterface; 

public class Employee {

	String name;
	int age;
    double salary;
	static int[] ary = new int[3];  //静态变量
	
	public static final int BOXWIDTH = 10;  //类常量
	
	public transient int limit = 10;   //对象持久化时，不会保存
	
	public Employee(String name) {
		this.name = name;
		ary[0] = 1;
	}
	
	public void empAge(int empAge) {
		age = empAge;
	}
	
	public void empSalary(double empSalary) {
		salary = empSalary;
	}
	
	public void printInfor() {
		System.out.println("名字:" + name);
		System.out.println("年龄:" + age);
	}
	
	public static void func() {
		System.out.println("class func");
	}
	
	public void addSalary() {
		for(int x = 0 ; x < 10 ; x++) {
			this.salary += 10.f;
		}
	}
}

abstract class Caravan{      //抽象类没有实例化方法，可以声明，但由子类实现
	String name ;
	public Caravan(String cName) {   //不能被Caravan主动调用
		name = cName;
	}
	public abstract void goFast();   //抽象方法 不提供实现 子类来实现
}

class SubCaravan extends Caravan{
	public SubCaravan(String cName) {    //子类实现，提供实例化方法
		super(cName);
		// TODO Auto-generated constructor stub
	}
	public void goFast() {
		System.out.println("abstract func");
	}
	
	String name = "tom";
	boolean result = name instanceof String;   //类型判断
	
}


class Animal{
   private String name;
   private int aid;
   public Animal(String myname, int myid) { //类的构造方法
	   name = myname;
	   aid = myid;
   }
   public void eat() {
	   System.out.println(name + aid + "在吃");
   }
	
   public void sleep() {
	   System.out.println(name + "在睡");
   }
}

class Mouse extends Animal{

	public Mouse(String myname, int myid) {
		super(myname, myid);
		// TODO Auto-generated constructor stub
	}
	
	public void sleep() {     //override
		System.out.println("老鼠在睡觉");
	}
	
	public String sleep (int id) {    //overload  重载是同方法名不同入参 出参可以不同
		return "mouse";
	}
}

class HostPlace implements SportInterface {     //接口的实现  多个用逗号分隔

	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub
		
	}
	
}





