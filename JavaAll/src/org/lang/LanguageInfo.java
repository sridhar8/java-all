package org.lang;

public class LanguageInfo {
	
	public void tamilLanguage() {
		System.out.println("Chennai Tamil");
		System.out.println("Madurai Tamil");
		System.out.println("Tirunelveli Tamil");
	}
	
	public void englishLanguage() {
System.out.println("British Engish");
System.out.println("American Enlish");
System.out.println("Irish");

	}
	public static void main(String[] args) {
		

		LanguageInfo lI = new LanguageInfo();
		lI.englishLanguage();
		lI.tamilLanguage();
}
}