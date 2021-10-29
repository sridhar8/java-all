package org.java.com;

public class UserDefinedException {
	
	private void vote(int i) throws Exception{
		if(i>18) {
			System.out.println("you are eligible to vote");
		}
		else {
			throw new ElectionCommission ("you are not eligible to vote");
		}
	}
public static void main(String[] args) throws Exception {
	UserDefinedException us = new UserDefinedException();
	us.vote(17);
	
}
}

//here we have to create our own exception
//for that here throws and throw keywords are used
//throws Exception has been used in methods level after the method content
//here int i are used for overloading purpose(datatypes are passed in args for overloading)
//throw has been used in action level
//here parent class name are used to create exception
//you are not eligible to vote is coming from parent class args (overloading)
//see ElectionCommission Class