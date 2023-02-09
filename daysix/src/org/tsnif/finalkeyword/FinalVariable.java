package org.tsnif.finalkeyword;
//Program to demonstrate final keyword
public class FinalVariable
{
 final static int x = 15;
 public static void print()
 {
	 /* We can't the value of x because x is final*/
	 //x = 17;
	 System.out.println("The value of x is: "+x);
	 
 }
 public static void main(String args[])
 {
  FinalVariable.print();
 }
}
