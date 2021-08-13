package com.pack.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[][]=new int[][]{{1,2,3},{11,22,33},{111,222,333}};
		
		for(int row=0;row<=2;row++)
		{
			for(int col=0;col<=2;col++){
				
				System.out.print(x[row][col]+"\t\t");
			}
			System.out.println();
		}
	}

}
