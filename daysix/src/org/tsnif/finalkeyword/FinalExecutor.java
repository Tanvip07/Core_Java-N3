package org.tsnif.finalkeyword;

public class FinalExecutor 
{
 public static void main(String args[])
 {
	 Chocolate s = new Chocolate();
	 s.flavour = "Dark Chocolate";
	 s.display();
	 s.setPrice(250);
	 s.display(s.getPrice()); }
}
