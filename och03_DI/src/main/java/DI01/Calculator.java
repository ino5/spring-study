package DI01;

public class Calculator {
	public void addition(int f, int s) {
		System.out.println("addition()");
		int result = f + s;
		System.out.println(f + " + " + s + " = " + result);
	}
	
	public void subtraction(int f, int s) {
		System.out.println("subtraction()");
		int result = f- s;
		System.out.println(f + " - " + s + " = " + result);
	}
	
	public void multiplicaction(int f, int s) {
		System.out.println("multiplicaction()");
		int result = f * s;
		System.out.println(f + " * " + s + " = " + result);
	}
	
	public void division(int f, int s) {
		System.out.println("division()");
		int result = f / s;
		System.out.println(f + " / " + s + " = " + result);
	}
	
	
}
