package org.tnsif.singleclassinheritance;
//child class
public class Student extends Citizen
{
//private data members	
 private int rollno;
 private String studname;
 
//getters and setters
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getStudname() {
	return studname;
}
public void setStudname(String studname) {
	this.studname = studname;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String name, String adhaarno, String city,long mbno,int rollno, String studname) {
	super(name, adhaarno, city, mbno);
	this.rollno = rollno;
	this.studname = studname;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", studname=" + studname + ", getRollno()=" + getRollno() + ", getStudname()="
			+ getStudname() + ", getName()=" + getName() + ", getAdhaarno()=" + getAdhaarno() + ", getCity()="
			+ getCity() + ", getMbno()=" + getMbno() +  "]";
}

}
