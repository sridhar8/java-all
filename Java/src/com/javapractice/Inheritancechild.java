package com.javapractice;

public class Inheritancechild extends Parent {
	
	/*why oops 
	 * Oops concept...while evolution of c program they use function or procedure oriented program
	 * in function oriented programs its difficult to find the error(e.g. one program have 500 lines and while compile it shows some error mean 
	 * we can't able to find that error/difficult to find the error
	 * so they plan to spilt the program into several sub programs..that is called Oops using object oriented programs
	 * and procedure oriented program is not secure..it can accessed globally.
	 * 
	 * inheritance notes
	 * without extends quote parent details can be accessible(same project,same package, different class so no need to use extends.no import quote
	 * with extends quote parent details can be accessible(same project,different package,different class so need to use extends.import quote
	 * Confusion is in object class
	 * Parent p = new Parent(); or Inheritancechild iC = new Inheritancechild();
	 * so by using inheritance object access the parent as well as inheritancechild details can be accesseble
	 * 
	 * Type
	 * single(parent to child)
	 * multilevel(parent to child to grand child to great grand child)
	 * hierachical(parent have more than one child so parent details share in more than one child)
	 * hybrid(combination  of single multilevel and hierachical inheritance is called hybrid inheritance
	 * multiple inheritance(more than one parent share their info to chid..) 
	*/
	
	private void street() {
		System.out.println("company address");
	}
	public void employeeid() {
		System.out.println("34533");
	
	}
	public static void main(String[] args) {
		Inheritancechild iC = new Inheritancechild();
	iC.employeeid();
	iC.companyName();
	iC.street();
	iC.warenty();
	iC.myPhone();
	

	}
	
}
