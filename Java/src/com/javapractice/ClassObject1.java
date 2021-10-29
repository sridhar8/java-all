package com.javapractice;

public class ClassObject1 {

	//first wirte the program. For run the program to create relation between program and String
	
	//Syntex of the method is public void name(){
	
	//Syntex of the object is ClassName reference=New ClassName
	
	
	public void companyName() {
	System.out.println("leather craft india");
		
	}
	
	public void companyLocation() {
		System.out.println("chengalpat");
	}
	
	public void employeeName() {
		System.out.println("sridhar");
	}
	
	public void employeeId() {
		System.out.println("1348");
		
	}
	
// to run the program to create main string and relation between string and program
	
	public static void main(String[] args) {
		
	
ClassObject1 o = new ClassObject1();
	o.companyLocation();
	o.employeeId();
	o.companyName();
	o.companyLocation();
	o.companyName();
	o.employeeName();
	}
}
