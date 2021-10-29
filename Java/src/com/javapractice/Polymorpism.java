package com.javapractice;

public class Polymorpism {

	/*polymorpism allows as to perform the same action into various forms
	 *Types(Over Loading,Over Rinding)
	 *Over Loading-task can be performed in same class in different ways,same class and same method
	 *different arguments-based on data types,based on ordern,based on count
	 *Over riding - task can be performed in different classes,it means different class, same method,same arguument
	 *eg(see educationInstitution)
	 */
	//based on data types
	public void empName() {
System.out.println("sridhar");
	}
public void empName(String a) {
	System.out.println("empName is "+ a);
}

public void empSalary(int b) {
	System.out.println("empsalary is "+ b);
}

public void empAttendance(double d) {
System.out.println("empAttendance is "+ d);

}

public void empGender(char c) {
System.out.println("empgender is "+c);
}
//based on order(datatype+order)
public void empName(String a,int b) {
System.out.println("empName is "+ a+" "+b);
}

private void empAttendance(String a,int b,float d) {
System.out.println("empName,salary and attendance is "+a+" "+b+" "+d);	
}

//based on count(datatype+order+boolien)

public void empStatus(boolean b,String a) {
System.out.println("empname,salary,and status is "+a+" "+b);
}


public static void main(String[] args) {
	Polymorpism ps = new Polymorpism(); 
	ps.empName("sridhar");
	ps.empSalary(45000);
	ps.empAttendance(56.3);
	ps.empName("Sridhar", 45000);
	ps.empAttendance("adf", 44343, 43.4f);
	ps.empGender('M');
	ps.empStatus(false, null);
	ps.empName();
}}
