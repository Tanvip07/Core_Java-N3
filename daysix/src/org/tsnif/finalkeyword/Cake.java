package org.tsnif.finalkeyword;
//Program to demonstrate final keyword on method
public class Cake 
{
 public String flavour;
	
 final void display()
 {
	 System.out.println("Flavour of cake is : " +flavour);
 }
//getters and setters
public String getFlavour() {
	return flavour;
}

public void setFlavour(String flavour) {
	this.flavour = flavour;
}

 
}
