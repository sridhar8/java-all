package com.javapractice;

public class Variable {
/*
	what is variable?
	variable is like a box in the computer's memory
	variables are used to store the values in the computers memory
	
	Types?
	3 common types
	1...local variables 
			
			declared: Inside the method
			Access: Inside the method
			Initialized: Should be initialized/ assigned and it wont accept declaretion
	2...Class variables or instance variable
			declared: Outside of the method, but inside the class
			Access: Access anywhere inside the class
			Initialized: It is not mandatory if value of calss variables is not given it take default value as 0
						if the local variables are not given inside the methods then class variable are accessed by default
						
	3...Static variables
			Class variables can be converted into Static variables 
			1.If we make class variables as static variable.. with its calss name we can call the values directly
			2.we can access the variable without using object.
			3.static variable can be accessed by different class in a package
			
			*/
	
//------------------------------------------------------------------------------------------------------------------
	//eg for local variable
	
/*	int i = 12;							//Class variable
	static int o=17;					//Static variable		//In that case their is no use of Class variable and Static variables
	public void empNumber() {									//because inside the object values are assigned for the program
		int g = 32;						//local variable
		System.out.println("empNumber is"+g);
		}
	protected void empSalary() {
		int h=420;						//local variable
		System.out.println("empSalary is "+h);
	
	}
public static void main(String[] args) {
	Variable v = new Variable();
	v.empNumber();
	v.empSalary();
	
	
}
}

	*/
	
	//-------------------------------------------------------------------------------------------------------
	
	//eg for Class variable 
	
	/*int i = 12;							//Class variable
	static int o=17;						//Static variable							//In that case their is no local variable in method 1
	public void empNumber() {															//so it take class variable as a local variable then access the value then run										//local variable
		System.out.println("empNumber is "+i);	// no local variable in method1			//here no use of static variable
		}
	protected void empSalary() {
		int h=420;								//local variable of method 2
		System.out.println("empSalary is "+h);
	
	}
public static void main(String[] args) {
	Variable v = new Variable();
	v.empNumber();
	v.empSalary(); 
	
}}
*/ 
//-------------------------------------------------------------------------------------------------------
	
	//eg for static variable
	
											// no Class variable
	static int o=17;						//Static variable							
	public void empNumber() {
	int i= 8;															//static variable can be accessed by different class in a package
		System.out.println("empNumber is "+i);	//local variable in method1				
		}
	public static void empSalary() {
		int h=420;								//local variable of method 2
		System.out.println("empSalary is "+h);
	
	}
public static void main(String[] args) {
System.out.println("enter the number "+o);		//no object is required for call static variable
	Variable v = new Variable();
	v.empNumber();
	Variable.empSalary();						// Static method is used in method 2
	
	
}}
	
	//----------------------------------------------------------------------------------------------------
/*
	
	int tamil=60;						//class
	int english=89;						//class
	int ss=88;							//class
	static int french=78;				//static
	{
	System.out.println(french);		
	}	
	public static void science() {
		int sC=80;						//local
		System.out.println("science mark is "+sC);
	}
	public void socialScience() {
		System.out.println("Social science mark is "+ss);
		
	}
	public  void total() {
		int sC=80;
	int t=tamil+english+french+sC+ss;
System.out.println("sum "+t);
	}
	public static void main(String[] args) {
		System.out.println(french);		
		Variable c = new Variable();
		Variable.science();
		c.socialScience();
		c.total();				//Static method initiate class name first
	
	
		
		
	}
	}
	*/
	
	