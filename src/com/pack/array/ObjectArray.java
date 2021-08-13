package com.pack.array;
class MyDate{
	private int day;
	private int month;
	private int year;
	
	public MyDate(int d,int m,int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}
	
	public boolean equals(Object o)
	{
		boolean result =false;
		if((o!=null )&& (o instanceof MyDate))
		{
			MyDate d=(MyDate)o;
			if((day ==d.day) && (month== d.month) && (year==d.year))
			{
				result =true;
			}
		}
		
		return result;
	}
	
	public String toString()
	{
		return  "["+this.day +"/"+ this.month +"/"+this.year+"]";
	}
	public int hashCode()
	{
		
		return (day ^ month ^ year);
	}
}

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//homogeneous collection
/*MyDate [] dates =new MyDate[3];

dates[0]=new MyDate(12, 3,2021);
dates[1]=new MyDate(1, 3,2021);;
dates[2]=new MyDate(2, 3,2021);;

	for(int i=0;i<dates.length;i++)
	{
		System.out.println(dates[i]);
	}
	}*/

		MyDate d1=new MyDate(9, 7, 2021);
		MyDate d2=new MyDate(9, 7, 2021);

if(d1==d2){
	System.out.println("identical");
}		
else
{
System.out.println("not identical");	
}

if(d1.equals(d2)){
	System.out.println("equals");
}		
else
{
System.out.println("not equal");	
}
}
}