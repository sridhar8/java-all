package org.training;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UserDefinedSet {
//create a userdefined set and insert 10 employee details
	//input:Emp Id,name,address,dob,phone,doj,emailId,gender,age,last salary
	//using scanner class insert 10 employee details
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Object> b= new LinkedHashSet<Object>();	
		for (int i = 1; i < 3; i++) {
			System.out.println("EMployee "+i+" details :");
		
		System.out.println("Enter the Emp Id ");
		int g=sc.nextInt();
		
		System.out.println("Enter the Emp Name ");
		String d=sc.next();
		
		System.out.println("Enter the Address");
		String s=sc.next();
		
//		System.out.println("Enter the dob");//if you entered here inthe sense we can get exception while getting input
//		String a=sc.nextLine();	//so added in last
		
		System.out.println("Enter the phone number");
		int q=sc.nextInt();
		
		System.out.println("Enter the doj");
		int w=sc.nextInt();
		
		System.out.println("Enter the email");
		String r=sc.next();
		
		System.out.println("Enter the gender");
		String t=sc.next();
		
		System.out.println("Enter the age");
		int y=sc.nextInt();
		
		System.out.println("Enter the last drawn salary");
		int u=sc.nextInt();
		
		System.out.println("Enter the dob");
		String a=sc.next();
	//	System.out.println("Employee Id:"+g+", Emp Name:"+d+", Address:"+s+", DoB:"+a+", Phone:"+q+", DOJ:"+w+", email:"+r+", Gender:"+t+", age:"+y+", Salary:"+u);
		
	//Set<Object> b= new LinkedHashSet<Object>();//for each not working by create set syntax here
b.add("Id: "+g);
b.add("name: "+d);
b.add("address: "+s);
b.add("DoB: "+a);
b.add("Ph: "+q);
b.add("DoJ: "+w);
b.add("emain: "+r);
b.add("gender: "+t);
b.add("age: "+y);
b.add("salary: "+u);
		

System.out.println("employee "+i+" details");	//try sysout("employee "+i+"Details "+b);
		
System.out.println(sc.nextLine());
	}	
		
for (Object s : b) {
//	for (int j = 1; j < 3; j++) {
//		//System.out.println("employee:"+j);
//		//System.out.println(s);
//}
	System.out.println(s);

	}
		}}
	
