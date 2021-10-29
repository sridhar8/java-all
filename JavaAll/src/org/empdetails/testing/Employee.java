package org.empdetails.testing;

public class Employee {

		private void empName(String a) {
System.out.println("empName is "+ a);
		
					}
		private void empDetails(String a,int b) {
System.out.println("empName is "+ a+" "+"salary is "+b);
		}
		private void empStatus(String a,int b,boolean c) {
System.out.println("empName "+a+" "+"salary "+b+" "+c);
		}
public static void main(String[] args) {
	

Employee n = new Employee();
n.empName("sridhar");
n.empDetails("sri", 45650);
n.empStatus(null, 0, false);
}
}
