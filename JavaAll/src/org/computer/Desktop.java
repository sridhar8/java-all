package org.computer;

public class Desktop implements Hardware,Software {
	@Override
	public void hardwareResources() {
System.out.println("cpu");		
	}
@Override
public void softwareresources() {
System.out.println("winrare");	
}	

private void descktop1() {
System.out.println("lenova");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.descktop1();
	d.softwareresources();
	d.hardwareResources();
	}
}
