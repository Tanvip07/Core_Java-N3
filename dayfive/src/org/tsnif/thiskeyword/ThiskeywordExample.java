package org.tsnif.thiskeyword;
//This keyword in terms of constructor
public class ThiskeywordExample 
{
 int num;
 ThiskeywordExample()
 {
	
 }
 ThiskeywordExample(int num)
 {
	 this.num = num;
 }
 public static void main(String args[])
 {
	 ThiskeywordExample t = new ThiskeywordExample(4);
	 System.out.println("num value : "+t.num);
 }
}
