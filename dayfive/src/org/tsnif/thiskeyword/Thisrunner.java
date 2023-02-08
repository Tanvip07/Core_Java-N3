package org.tsnif.thiskeyword;
//This keyword method that returns current class instance

class Mathematics
{
	int a,b;
	Mathematics()
	{
		a=10;
		b=20;
	}
	void display()
	{
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
	}
}

public class Thisrunner 
{
 public static void main(String args[])
 {
	 Mathematics m = new Mathematics();
	 m.display();
 }
}
