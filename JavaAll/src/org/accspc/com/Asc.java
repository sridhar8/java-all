package org.accspc.com;

import com.javapractice.AccessSpecifier;

public class Asc extends AccessSpecifier{
	@Override
	public void teacherName() {
		// TODO Auto-generated method stub
		super.teacherName();
	System.out.println("sss");
	}
	@Override
	protected void endTime() {
		// TODO Auto-generated method stub
		super.endTime();
	System.out.println("4");
	}
	
	public static void main(String[] args) {
		Asc a=new Asc();
		a.endTime();
		a.teacherName();

}}
