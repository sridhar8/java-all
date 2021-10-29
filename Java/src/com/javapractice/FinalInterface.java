package com.javapractice;

public class FinalInterface implements FullAbstractParent1,FullAbstractParent2 {

	@Override
	public void lapName() {
System.out.println("lenova");		
	}

	@Override
	public void lapModel() {
System.out.println("gov");		
	}

	@Override
	public void mobName() {
System.out.println("red");		
	}

	@Override
	public void mobModel() {
System.out.println("434");		
	}
public static void main(String[] args) {
	FinalInterface fI = new FinalInterface();
	fI.lapModel();
	fI.lapName();
	fI.mobModel();
	fI.mobName();

}

@Override
public void lapyear() {
	// TODO Auto-generated method stub
	
}
}
