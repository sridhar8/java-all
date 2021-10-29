package org.accspc.com;

public class accspecytest extends AccSpecyTesting{
public static void main(String[] args) {
	
	accspecytest b = new accspecytest();//object of child class
	b.dehfalutmethod();
	b.protectedmethod();
	b.publicmethod();

//	AccSpecyTesting d=new AccSpecyTesting();//object of parent class
//	d.dehfalutmethod();
//	d.protectedmethod();
//	d.publicmethod();
	
}
}


//public can be called any class and any packages by using extends keyword
//private can be called by within the class itself it can not be extends to some other class or some other packages
//protected can be call in some other class in same package by making an object of parent class name or child class name
//protected can be called other package by calling child class object(org.add//accspec)
//default void method can be called within the package itself using extend keyword. it cannot be extend to some other packages
