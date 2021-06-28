package temp.callbyvalue;

public class Main {
	public static void run(A arg1, A arg2) {
		arg1.value = 111;
		arg2 = arg1;
	}
	
	public static void main(String[] args) {
		A a1 = new A(1);
		A a2 = new A(2);
		System.out.println("a1.value: " + a1.value);
		System.out.println("a2.value: " + a2.value);
		run(a1, a2);
		System.out.println("a1.value: " + a1.value);
		System.out.println("a2.value: " + a2.value);
		
	}
}
