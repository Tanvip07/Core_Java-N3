package org.tsnif.superkeyword;
//child class
public class Lily extends Flower
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
	public Lily() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameterized Constructor
	public Lily(String name) {
		super();
		this.name = name;
	}
	
	public void display()
	{
	 System.out.println(" Lily ");
	 super.setName("Flower");
	 System.out.println(super.getName());
	}
}
