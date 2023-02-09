package org.tsnif.staticmethod;
//Program to demonstrate on Static Block
public class StaticblockExecutor
{
public static void main(String args[])
{
	System.out.println(StaticBlock.getName());
	
	StaticBlock s = new StaticBlock();
	s.setNum(267);
	System.out.println(s.getNum());
}
}
