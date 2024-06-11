package dev.lpa;

public class BaseClass {

	public final void recommendedMethod() {
		System.out.println("[BaseClass.recommendedMethod]: Best Way to Do it");
		optionalMethod();
		mandatoryMethod();
	}

	protected void optionalMethod() {
		System.out.println("[BaseClass.optionalMethod]: Customize Optional Method");
	}

	private  void mandatoryMethod() {
		System.out.println("[BaseClass.mandatoryMethod] : NON-NEGOTIABLE");
	}

	public static void recommendedStatic() {
		System.out.println("[BaseClass.recommendedStatic] BEST Way to Do it");
		optionalStatic();
		mandatoryStatic();
	}

	private static void mandatoryStatic() {
		System.out.println("[BasieClass.mandatoryStatic] : Optional");
	}

	protected static void optionalStatic() {
		System.out.println("[BaseClass.optionalStatic] : Optional");
	}
}
