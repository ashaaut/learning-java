package com.pack.array;

import java.util.Scanner;

public class WrapperBoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val=3345;
		Integer val1=new Integer(val);//boxing
		int val2=val1.intValue();//unboxing
		Scanner sc=new Scanner(System.in);
		int x1=Integer.parseInt(sc.next());
		int x2=Integer.parseInt(sc.next());
		System.out.println(x1+x2);
		Integer val3=val;//autoboxing
		int x3=val3;//autounboxing
	}

}
