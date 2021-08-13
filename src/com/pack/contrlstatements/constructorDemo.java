package com.pack.contrlstatements;
class A{
	int x=12;
	public A()
	{
		System.out.println("Default constructor");
	}
	public A(int x)
	{ //x=11;
		x=this.x;
	System.out.println(x);
	}
	public A(String name,int id)
	{
		//name="Disha";
		//id=101;
		System.out.println(name + id);
	}
}
public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new A();
A a2=new A(78);
A a3=new A("Sushant",55);


	}

}
