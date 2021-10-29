package org.constructor.com;

public class A {
	
	public A() {
this ("JAVA");
System.out.println("default for A");
}
 public A(int Id) {
 this(3436.12f);
System.out.println(Id);
 }
 
 public A(String Name) {
	 this(12);
	 System.out.println(Name);
	 
 }
 
 public A(float sal) {
	 System.out.println(sal);
 }
public static void main(String[] args) {
	A a=new A();
}}
