package org.tsnif.thiskeyword;
//It can be used to refer instance of current class
public class Account
{
 int a;
 int b;
 public void setdata(int a1,int b1)
 {
  this.a = a1;
  this.b = b1;
 }
 public void showdata()
 {
	 System.out.println("Value of A : "+a);
	 System.out.println("Value of B : "+b);
 }
  
}
