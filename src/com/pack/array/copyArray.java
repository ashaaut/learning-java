package com.pack.array;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello bolo.");
int [] set1={11,22,33,44,55,66,77,88,99,110};
int [] set2=new int[]{1,2,3};

System.out.println("before copyting");
for(int i=0;i<set1.length;i++)
{
System.out.println(set1[i]);
}
for(int i=0;i<set2.length;i++)
{
System.out.println(set1[i]);
}
//set2=set1.clone();
System.arraycopy(set1, 2, set2, 0,3);


System.out.println("after copyting");
for(int i=0;i<set1.length;i++)
{
System.out.println(set1[i]);
}
for(int i=0;i<set2.length;i++)
{
System.out.println(set2[i]);
}

}

}
