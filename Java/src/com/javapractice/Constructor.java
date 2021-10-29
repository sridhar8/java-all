 package com.javapractice;

public class Constructor extends Cons1 {
/*in Java , a constructor is a "block of codes" similar to the method.
 * when we create an object for the class, the default condtructor will execute automatically.
 * it supports method overloading.
 * every time while creating an object by entering the new() keyword, at least one constructor is called.
 
 
 
 *two rules are their to defined for the constructor.
 1.constructor name must be the same as its class name.
 2.a constructor must have no explicit return type(void).
 3.a java constructor cannot be abstract and static.
 
 
 
 *there are two types of constructors in java:
 1.default constructor(no-args constructor)
 2.parameterized constructor
 
 */
	
	
	//----------------------------------------------------------------------------
	

	public  Constructor() {					//usually while creating an method it shows private void empty return type() {
System.out.println("default constructor"); 	//here we have to delete void (no explicit return type)

	}
private Constructor(String a) {				//parameterized 

	System.out.println("STring constructor "+a);

}	

public Constructor(int d,int h) {
	super(8);
System.out.println("int value constructor "+d+" "+ h);
}

public Constructor(int d) {
System.out.println("single int "+d);
}

Constructor(float b){
	
	System.out.println("float constructor "+ b);
}


public static void main(String[] args) {
	//new Constructor();
	new Constructor(345);
	//new Constructor(870,970);
//	new Constructor(679);
//	new Constructor("sr");
//	new Constructor(7.8f);
//	
	//Constructor c = new Constructor();//cannot access

	
}
}

//-----------------------------------------------------------------------
	
/*	
	public void empName(){
		System.out.println("sri");			// in that eg first we create empty return type method and then 2nd one is default constructor
	}										//in the main method cant able to create a constructor object
											//but in run time compiler give default constructor is first output then call empty return type object
	
	
	public Constructor() {
System.out.println("default");
}
	
	public static void main(String[] args) {
  Constructor c = new Constructor();
//		  c.empName();
	}}

*/
