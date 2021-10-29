package org.edu;

public class Education {

	public void ug(String m) {
System.out.println("some ug courses name are"+m);
	}
	public void pg(String n) {
System.out.println("some pg courses are"+n);

	}
	public static void main(String[] args) {
		Education e = new Education();
		e.ug("BSc computerscience");
		e.pg("MSc physics");
		
	}
}
