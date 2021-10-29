package com.javapractice;

public class Parent extends Abstract {
	/*Parent class used to access the details from one class to other class,one package to another package 
	  but it is cannot to access the details from the project to other project
	  for access the details we have to use extend method
	  see Inheritancechild
	*/
	protected void companyName() {
		System.out.println("company name is Lci");
		
	}
public void employeeName() {
System.out.println("sridhar k");
}		

private void contactDetails() {
System.out.println("4362385348");
}

@Override
public void warenty() {
	System.out.println("3");
	
}

@Override
public void myPhone() {
	super.myPhone();
	System.out.println("red");
}
public static void main(String[] args) {
	Parent p = new Parent();				//short cut- ctrl+2+L (new ctrl+spacebar)
	p.companyName();
	p.contactDetails();
	p.employeeName();
p.warenty();
	p.myPhone();
	
//}
//@Override
//public void warenty() {
//System.out.println("1yr warrenty");	


}
	}

