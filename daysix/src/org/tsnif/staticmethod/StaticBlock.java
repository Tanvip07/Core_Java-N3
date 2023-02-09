package org.tsnif.staticmethod;
//Program to demonstrate on Static Block
public class StaticBlock
{
	//non-static variable
 private int num;
 //static variable
 private static String name;
 //static block
 /* static block variable is used to initialise static variable*/
 public int getNum() 
 {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public static String getName() {
	return name;
}
public static void setName(String name) {
	StaticBlock.name = name;
}
 
static
{
	name = "Ganesh" ;
}

 
}
