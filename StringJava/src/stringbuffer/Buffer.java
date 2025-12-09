package stringbuffer;

import java.util.Arrays;

public class Buffer extends Object{

	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Hello");
	System.out.println("String 1 is : "+sb);
    StringBuilder sb1=new StringBuilder("hii");
    System.out.println("String 2 is : "+sb1);
    String s="hello";
    String t=" World";
    String st=s+t;
    System.out.println("Concatenation of String : "+st);
    StringBuilder b=new StringBuilder("hii java");
    b.append(" World");
    System.out.println(b);
    
    StringBuffer sbf=new StringBuffer("HELLO");
    sbf.append(" WORLD");
    System.out.println(sbf);
    
    int[] arr = {10, 20, 30};
    System.out.println(arr.toString());//output=[I@3f99bd52
    
    String[] arr1 = {"vaishnavi","Punam","Nisha","Dipika"};
    System.out.println(Arrays.toString(arr1));
    
    System.out.println("This is a String ");
    StringBuffer st1=new StringBuffer("I am a vaishnavi");
    System.out.println(st1);
    StringBuffer st2=new StringBuffer("I am a vaishnavi Jagtap");
    System.out.println(st2);
    StringBuffer sbu=new StringBuffer("happy");
    sbu.insert(2,"hi");
    System.out.println(sbu);
    sbu.delete(2,4);
    System.out.println(sbu);
    sbu.deleteCharAt(2);
    System.out.println(sbu);
    sbu.replace(2, 3,"PP");
    System.out.println(sbu);
    sbu.reverse();
    System.out.println(sbu);
    System.out.println(sbu.capacity());
    System.out.println(sbu.length());
    StringBuffer sbsc =new StringBuffer("Abcdef");
    System.out.println(sbsc.capacity());
    StringBuffer sbsc1 =new StringBuffer("ghikfa");
    System.out.println(sbsc1.capacity());
    
    
	}
}
