package com.etienne;

public class Main {

	public static void main(String[] args) {

		System.out.println("-".repeat(40));
		String VarFour = "this is a private to main()";

		ScopeCheck scopeInstance = new ScopeCheck();
		scopeInstance.useInner();

		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
		System.out.println("varThree is not accessible here " + innerClass.varThree);
		/*System.out.println("scopeInstance VarFour is " + scopeInstance.getVarOne());
		System.out.println(VarFour);

		System.out.println("-".repeat(40));
		scopeInstance.timesTwo();


		System.out.println("-".repeat(40));
		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
		innerClass.timesTwo();*/
	}
}
