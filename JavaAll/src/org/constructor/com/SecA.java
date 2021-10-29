package org.constructor.com;

public class SecA extends TeacherInfo{
	int d=33;				//instance Variable
	String k="poonamalle";	//instance string variable
	float l=45.8f;			//instance variable
	
	public SecA() {			//childconstructor1(default constructor)
		
System.out.println("abdul");
}
	
	
public SecA(float p) {	// childconstructor 2(parameterized constructor)
	super(66);			//invoke to parent constructor2
	this.l=l;			//invoke to current condtructor

System.out.println(l+p);
}

public SecA(int u, String i){	//child constructor 3(parameterized)
	this.d=d;					//invoke to current constructo
	this.k=k;					//invoke to current construcotr
System.out.println("entered number is "+d+" "+u+" anfd the location is "+k+" "+i);
}

public static void main(String[] args) {
	//SecA a = new SecA();//not able to create
	new SecA();				//call constructor1(default construcor)
	new SecA(7.9f);			//call constructor2(parameterized )
	new SecA(7, "cmt");		//call constructor 3(parameterized)
}
}
