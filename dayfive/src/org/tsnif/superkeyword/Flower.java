package org.tsnif.superkeyword;
//Program to demonstrate an example of Super keyword in terms of variable
public class Flower 
{
 private String name;
//getters and setters
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//Default constructor
public Flower() {
	System.out.println("Flower-Parent Class");
	// TODO Auto-generated constructor stub
}
//Parameterized Constructor
public Flower(String name) {
	super();
	this.name = name;
}
 

 
}
