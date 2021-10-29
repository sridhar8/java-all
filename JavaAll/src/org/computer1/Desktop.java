package org.computer1;


public class Desktop implements Hardware,Software{

	@Override
	public void softwareResource() {
System.out.println("virus");		
	}

	@Override
	public void hardwareResources() {
System.out.println("cpu");		
	}
	private void desktopModel1() {
System.out.println("regewir");
	}
public static void main(String[] args) {
	Desktop n = new Desktop();
n.desktopModel1();
n.hardwareResources();
n.softwareResource();}}
