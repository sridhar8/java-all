package com.javapractice;

public class LoopConcept {
/* for repeat the same action into number of times loop concept used
 * 3 types of loops are their
 * while and do while and for loop
 * In both types have 2 sub types
 * pre increment/decrement
 * post increment/decrement
 * while is used for entry level condition checking the action
 * do while is used for exit level condition checking the action
 */
	/*public static void main(String[] args) {
		int i=1;
		while (i<5) {
		i++;
		System.out.println(i);	//int i=1;-----initialization
								//while(i<5----condition
								//System.out.println('i')------action
								//while run the program the result is endless action because no limit or iteration value has been set
								//i++;------is iteration or increment.
								//based on the iteration action position pre increment and post increment has been decided
		}}	}	*/				
//iteration action is coming before the sysout action this loop is called pre iteration for while loop action
		//-----------------------------------------------------------------
	/*public static void main(String[] args) {
			int i=1;
			while (i<5) {
		System.out.println(i);
		i++;
		
//iteration action is coming after the sysout action this loop is called post iteration for this while loop action
		}}}
		*/
		//-----------------------------------------------------------------

		
			public static void main(String[] args) {
			int i=1;
	
do {
System.out.println(i);
i++;					//post increment in do while or exit level condition check
i++;
System.out.println(i);//pre increment
}
while (i<9);
	
}
}
		//-------------------------------------------------------------------
	