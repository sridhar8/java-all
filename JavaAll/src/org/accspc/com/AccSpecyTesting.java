package org.accspc.com;

public class AccSpecyTesting {
	
	private void privatemethod() {
System.out.println("sridhar");
	}
	protected void protectedmethod() {
System.out.println("ssssss");
	}
	public void publicmethod() {
		System.out.println("sd");
	}
	void dehfalutmethod() {
System.out.println("ss");
	}
	
	
public static void main(String[] args) {
	AccSpecyTesting a =new AccSpecyTesting();
	a.dehfalutmethod();
	a.privatemethod();
	a.protectedmethod();
	a.publicmethod();
}
}
