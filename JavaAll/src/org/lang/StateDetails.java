package org.lang;

public class StateDetails {

	private void southIndia() {
		System.out.println("TamilNadu");
		System.out.println("Kerala");
		System.out.println("Karnataka");
	
	
}
	
private void northIndia() {
	System.out.println("orisa");
	System.out.println("kalkatta");
	System.out.println("jargand");
	
}		
	public static void main(String[] args) {
		StateDetails sD = new StateDetails();
		sD.northIndia();
		sD.southIndia();
	}
}
