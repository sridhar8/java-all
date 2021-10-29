package com.javapractice;

import java.util.Scanner;

public class UserDefined {
	
	
public static void main(String[] args)throws Exception {
	Scanner d = new Scanner(System.in);
	System.out.println("Enter the grouph which you prefered");
	String g=d.nextLine();
//	System.out.println(g);
	
if (g.equalsIgnoreCase("math")) {							//<---string cannot be check with other string in conditions(g=="math)
	System.out.println("you  prefered group is "+g);		//so we have to use equals and equalsIgnoreCase
}
else if (g.equalsIgnoreCase("Science")) {
System.out.println("you prefered group is "+g);
														//also see in org.java.com -->userdefinedexception and electioncommission
}
else if (g.equalsIgnoreCase("vocational")) {			//see in  switch case
	System.out.println("you prefered group is "+g);
	
}
else {
	throw new School("you choise is invalid you can choose either in math,Science,Vocational");
	
}
	

}

}
