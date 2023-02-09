package org.tsnif.staticvariabledemo;
//Program to demonstrate on static variable
//Driver class
public class StaticExecutor 
{
 public static void main(String args[])
 {
	 StaticVariable s = new StaticVariable("Nia Lopez");
	 System.out.println(s);
	 //use classname.variablenname to print static variable
	 System.out.println(StaticVariable.companyName);
	
}
}