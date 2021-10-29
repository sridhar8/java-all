package com.javapractice;

public abstract class Abstract {	//in class must be in abstract for abstract class

	/*Showing only necessary data and hiding a unwantwed datas
*providing the necessary datas to end user what they asked
*and we do not provide how they come but result only we provide
*It much related to inheritance,abstract mean incomplete method.
*Encapsulation and abstraction are the two methosa used to secure the data
*Data Hinding + Abstraction is called encapsulation
*Keyword: Abstract in class and method
*types:partial abstracct,interface or fully abstract
*there is no implementation part which means no main method
*/
public void myPhone() {							//partial abstract(one normal method and abstract method in same class
System.out.println("My mob model is redme");
}

public abstract void warenty();//see Parent extends into parent class

void secutity() {		//defaulty return type not available naturally in abstract class

	System.out.println("1month");
}
}

