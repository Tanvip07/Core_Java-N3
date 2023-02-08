package org.tsnif.thiskeyword;
//This keyword in method call
class HR
{
	//void display()
	void display(HR obj)
	{
		System.out.println("Human Resource");
	}
	void accept()
	{
		//display();
		display(this);
	}
}

public class ThiskeywordExecutive
{
	public static void main(String args[])
	{
		HR obj = new HR();
		obj.accept();
	}
 }
