package com.pack.contrlstatements;

public class StaticExample {

	static int y;
	static int var1=10;
	int var2=2;//instance variable
	static {
		
		y=5;
	}
	public StaticExample()
	{
		var1++;
		var2++;
		System.out.println("static "+ var1);
		System.out.println("non static"+var2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticExample se1=new StaticExample();
StaticExample se2=new StaticExample();
StaticExample se3=new StaticExample();
System.out.println(y);
System.out.println(se1.var2);

	}

}
