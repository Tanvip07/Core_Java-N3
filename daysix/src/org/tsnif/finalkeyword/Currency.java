package org.tsnif.finalkeyword;
//To demonstrate final keyword on class
final public class Currency
{
  private String type;
  void print()
  {
	  System.out.println("Currency type : "+type);
	  
  }
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
  
  
}
