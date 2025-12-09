package Strings;

import java.util.Arrays;

public class Manipulation {

	public static void main(String[] args) {
		// Length and char access
//		String s1="hello all, i am learning java.";
//		int len=s1.length();
//		System.out.println("String Length is : "+len);
//        char ch=s1.charAt(29);
//        System.out.println("Character at index 29 is : "+ch+".");
		
		//Substring extraction 
//		String str1="we are fool till when we r not getting overall knowledge";
//		String sub=str1.substring(35);
//		System.out.println("Substring is : "+sub);
//		String sub1=str1.substring(31,43);
//		System.out.println("Substring is : "+sub1);
		
		//case conversion
//		String str1="we are fool till when we r not getting overall knowledge.";
//		String ab=str1.toLowerCase();
//		System.out.println(ab);
//		String cd=str1.toUpperCase();
//		System.out.println(cd);
		
		//Equality and Comparison
//	String one="I am good";
//		String two="I am good";
//		boolean value=one.equals(two);
//		System.out.println(value);
//		boolean value1=one==two;
//		System.out.println(value+" "+value1);
//		
//		String three=new String("I am good");
//		boolean v1=one.equals(three);
//		System.out.println(v1);
//		boolean v2=one==three;
//		System.out.println(value+" "+v2);
//		
//		boolean v3=one.equals(three);
//		System.out.println(v1+ " "+v2+" "+v3);
		
		//Contains
		
//		String sd="I am hopping a lot of things.";
//		boolean yes=sd.contains("hopping");
//		System.out.println(yes);
//		boolean start=sd.startsWith("I am");
//		boolean end=sd.endsWith("things.");
//		System.out.println("String starts with : "+start+" And ends with : "+end);
		
//		Searching
//		String abc="Hello all,I am learning Java";
//		int in=abc.indexOf('n');
//		System.out.println(in);
//		int l=abc.lastIndexOf('n');
//		System.out.println(l);
//		int index=abc.indexOf("I am");
//		System.out.println(index);
//		int index1=abc.lastIndexOf("I am");
//		System.out.println(index1);
		
		//String modification
//		String  rep="Hello all, I am learning Java, I am good";
//		String rep1=rep.replace("I am","we are");
//		System.out.println(rep1);
//		String rep2=rep.replace(",","+");
//		System.out.println(rep2);
//		
//		String zx=rep.replaceAll("[^a-zA-Z0-9]","#");
//		System.out.println(zx);
		
		//whitespace and trimming
//		String rep="  Hello all,I am learning Java, I am good     ";
//		System.out.println(rep.trim());
		
		
		//splitting and concatenation
		String once="We are Students";
		System.out.println(Arrays.toString(once.split("")));
		System.out.println(Arrays.toString(once.split("e")));
		
		String two=" And happy too";
		String con=once.concat(two);
		System.out.println(con);
		
	}

}

