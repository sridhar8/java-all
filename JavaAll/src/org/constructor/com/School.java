package org.constructor.com;

public class School extends SecB {
	
	//public int i=10,c=20;	//instance variables
	//public String u="sri";
	
	public School() {					 //child constructor 1
		this ("sri");           		 // call child construcotr 2
System.out.println("SS school");
	}
								 		//child constructor 2
	public School(String r) {    		//Call child constructor 3
		this(34);
		System.out.println("entered number is "+r);
	}
	
		public School(int g){			//child 
		super(67);						//call parent constructor int action
		//this.c=c;
		System.out.println("g is "+g);
	
		
	}

	public static void main(String[] args) {	//while using extends keywords we can access the parent methods(constructor) in main method of child
												//while in this program we use super and this() actions so we can access the parent construcotr also in single construtor i main method
		new School();							//incase we use this.l=l method in the sense we can use instance variable to fix the current construcotor values			
		//new School(66);						//for better understanting see secA and teacherinfo class
		//new School("kumar");					//this.l=l case we can call constructor based on data type which we can used in program
	
		}
}
	
//-----------------------------------------------------------------------------------
	/*	public School() {
		System.out.println("SS school");
			}
			
		public School(String r) {
		System.out.println(r);
			}
			
		public School(int g){
		System.out.println(g);
			
			}

		public static void main(String[] args) {

				//new School();							//without this super keywords
				new School("boys School");
				//new School(43)	;		
				//SecB bb=new SecB(13);

}
}

	*/
//------------------------------------------------------------------------------
/*	public School() {
		System.out.println("SS school");
			}
			
		public School(String r) {						//Constructor type object
			System.out.println(r);
		}												//their is no instant variable
														//while run time it show with default constructor fo parent 
																
		public School(int g){
		System.out.println(g);
			
			}

		public static void main(String[] args) {
				//School s = new School();
			new School("sridhar");
			new School(5);
}}
*/
//------------------------------------------------------------------------------------------