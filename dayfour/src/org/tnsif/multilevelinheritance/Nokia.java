package org.tnsif.multilevelinheritance;

public class Nokia
{
	//private data members
 private int modelno;
 public void display()
 {
	 System.out.println("The Model no is : "+modelno);
 }
 //getters and setters
 public int getModelno() {
	return modelno;
}

public void setModelno(int modelno) {
	this.modelno = modelno;
}

//default constructor
public Nokia() 
{
	System.out.println("Nokia Class");
	// TODO Auto-generated constructor stub
}
//parameterized constructor
public Nokia(int modelno) {
	super();
	this.modelno = modelno;
}
 
}
