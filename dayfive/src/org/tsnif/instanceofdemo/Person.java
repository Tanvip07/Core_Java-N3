package org.tsnif.instanceofdemo;

public class Person 
{
//data	
 private String name;
 private String address;
 //getters and setters
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
//default constructor
public Person() {
	System.out.println("Parent Class");
	// TODO Auto-generated constructor stub
}
//parameterized constructor
public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + "]";
}


 
}
