package org.tsnif.finalkeyword;
//Program to demonstrate final keyword in method
public class Chocolate extends Cake
{
	public int price;
	/* if any method is declare as final in parent class and we are going to
	 * use method inside
	 */
 final void display(int price )
{
	 System.out.println("The Price is : "+price);
	 
}
 //getters and setters
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
