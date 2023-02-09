package org.tsnif.staticmethod;
//Program to demonstrate on static method
public class Staticmethod 
{
	//private data members 
static private double salary = 45000.67;
 //static method
 static void display()
 {
	 System.out.println("Salary is : "+salary);
 }
 
 //getters and setters
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
 
 
}
