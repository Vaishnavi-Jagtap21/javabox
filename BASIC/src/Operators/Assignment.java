package Operators;

public class Assignment {

	public static void main(String[] args) {
		// Assignment Operator
		int a=5;
		int b=7;
		int c=a;
		
		System.out.println("c : "+c);
		System.out.println("a+=b :"+(a+=b)); //a=a+=b
		System.out.println("a-=b :"+(a-=b)); //a=a-=b
		System.out.println("a*=b :"+(a*=b)); //a=a*=b
		System.out.println("a/=b :"+(a/=b)); //a=a/=b
		System.out.println("a%=b :"+(a%=b)); //a=a%=b
	}

}
