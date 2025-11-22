package Operators;

public class Bitwise {

	public static void main(String[] args) {
		// Bitwise Operator
		int x=11;
		int y=30;
		System.out.println("Bitwise And :"+(x&y));
		System.out.println("Bitwise Or :"+(x|y));
		System.out.println("Bitwise Negation :"+~y);
		System.out.println("Bitwise Or :"+~(x|y));
		System.out.println("left shift: "+(y<<2));
		System.out.println("Right shift: "+(y>>2));
		System.out.println("Right shift: "+(y>>>2));
		
	}

}
