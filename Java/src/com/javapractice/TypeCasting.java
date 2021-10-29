package com.javapractice;

public class TypeCasting {
	
	/*Casting is a process of converting a value from a data type into another datatype is called casting.
types:
	1.winding type casting (converting lower datatype into higher datatype--->byte--short--int--long--float--double)
	casting down or implicit convertion
	it is done automatically
	target datatype must be larger than the source type
		
	2.narrowing type casting(converting higher datatype into lower datatype--->double--float--long--int--short--byte)
	casting up or explicit convertion
	it is done manually
	if manual type casting not performed, compiler shows compile time exception
*/
	//-----------------------------------------------------------------------------------------------------
//winding type casting
	public static void main(String[] args) {
		byte g=2;
		short k;
		k=g;
		System.out.println(k);
	int c;
	c=g+k;
	System.out.println(c);
//	}
	


//}

	//-----------------------------------------------------------------------------------------------------
	
	//narrowing type casting
//public static void main(String[] args) {
	int a;
	a=130;
	byte b;
	b=(byte)a;
	System.out.println(b);
}}