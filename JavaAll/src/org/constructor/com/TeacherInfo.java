package org.constructor.com;

public class TeacherInfo {
	
	int l=7;
	public TeacherInfo() {
		
System.out.println("j");	

	}
	
	public TeacherInfo(int l) {
		this.l=l;
	
		System.out.println("value is "+l);
	}

public static void main(String[] args) {
	new TeacherInfo();
}}
