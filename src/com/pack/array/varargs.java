package com.pack.array;

public class varargs {

	static int ADD(int ... a)
{
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
	}
return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ADD(1,2));
		System.out.println(ADD(1,3,4,5,7,8));
		System.out.println(ADD(6,7,5,4,2,1,6,11,23));
		
	}

}
