package org.tnsif.singleclassinheritance;

public class Citizen {
   private String name;
   private String adhaarno;
   private String city;
   private long mbno;
//getters and setters
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdhaarno() {
	return adhaarno;
}
public void setAdhaarno(String adhaarno) {
	this.adhaarno = adhaarno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getMbno() {
	return mbno;
}
public void setMbno(long mbno) {
	this.mbno = mbno;
}
//default constructor
public Citizen() {
	System.out.print("parent class");
	// TODO Auto-generated constructor stub
}

//parameterized 
public Citizen(String name, String adhaarno, String city, long mbno) {
	super();
	this.name = name;
	this.adhaarno = adhaarno;
	this.city = city;
	this.mbno = mbno;
}
@Override
public String toString() {
	return "Citizen [name=" + name + ", adhaarno=" + adhaarno + ", city=" + city + ", mbno=" + mbno + "]";
}
   
   
}
