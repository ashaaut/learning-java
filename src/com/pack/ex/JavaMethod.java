package com.pack.ex;

import java.util.Scanner;

public class JavaMethod {

	public static void Add(int x,int y)
	{
		Hello h1=new Hello();
		h1.x=101;
		//return x+y;
		System.out.println(x+y);
	}
	
	public static void main(String [] arr)
	{
		Scanner sc=new Scanner(System.in);
		//int v1=sc.nextInt();
		//int v2=sc.nextInt();
		//System.out.println(Add(3,4));
		Add(3,4);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}
}
