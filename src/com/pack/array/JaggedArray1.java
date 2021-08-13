package com.pack.array;

public class JaggedArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int ar[][]=new int[3][];
 ar[0]=new int[2];
 ar[1]=new int[3];
 ar[2]=new int[4];
int ctr=0;

for(int row=0;row<ar.length;row++)
{
		for(int col=0;col<ar[row].length;col++)
		{
			ar[row][col]=ctr++;
		}
}

//print the jagged 
for(int row=0;row<ar.length;row++)
{
		for(int col=0;col<ar[row].length;col++)
		{
			System.out.print(ar[row][col]+"\t");
		}

		System.out.println();
	}

}
}