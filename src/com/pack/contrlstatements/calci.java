package com.pack.contrlstatements;

import java.util.Scanner;

import com.pack.ex.Hello;

public class calci {

	public static int add(int x,int y)
	{
		return x+y;
		}
	public static int sub(int x,int y)
	{
		return x-y;
	}
	public static int mult(int x,int y)
	{
		return x*y;
	}
	public static int div(int x,int y)
	{
		return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String choice="Y";
		String op;
		Hello h1=new Hello();
		
		
		
		
		System.out.println("enter the nos");
		
		Scanner sc=new Scanner(System.in);
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		
		System.out.println("enter the operation wants to perform");
		op=sc.next();
		switch(op){
		case "+" : System.out.println(add(v1,v2));
		break;
		case "-" : System.out.println(sub(v1,v2));
		break;
		case "*" : System.out.println(mult(v1,v2));
		break;
		case "/" : System.out.println(div(v1,v2));
		break;
		default:System.out.println("invalid");
		}
		
		System.out.println("Enter the choice");
		choice=sc.next();
	while(choice!="N")
     break;
	

}}
