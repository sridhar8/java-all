package com.javapractice;

public class AccessSpecifier {
	
	private void schoolName() {
System.out.println("ss hr sec");
	}
	
	public void teacherName() {
System.out.println("kandasami");
	}
	
	protected void endTime() {
		System.out.println("5o'clk");
		
	}
	
 void weekEnd() {
System.out.println("saturday");
	}

public static void main(String[] args) {
	AccessSpecifier aS = new AccessSpecifier();
	aS.schoolName();
	aS.endTime();
	aS.teacherName();
	aS.weekEnd();
	
}
}
