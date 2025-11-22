package Polymorphism;

public class Overloading {
    
	 int add(int a,int b)
	 {   
		 int c=a+b;
		 return c;
	 }
	 long add(long a,long b)
	 {   
		 long c=a+b;
		 return c;
	 }
	 float add(float a,float  b,float c)
	 { 
		 float d=a+b+c;
		 return d;
	 }
	 void add(float a,float  b,float c,float d)
	 {
		 System.out.println("Addition of "+a+" And"+b+" And "+c+" And"+d+" is : "+a+b+c+d);
	 }
	 double add(double a,double b,double c,double d,double e)
	 {   
		 double f=a+b+c+d+e;
		 return f;
	 }
	public static void main(String[] args) {
		//Overloading
		Overloading ol=new Overloading();
		
		System.out.println("Addition is "+ol.add(4,3));
		System.out.println("Addition is "+ol.add(100,200));
		System.out.println("Addition is "+ol.add(4.5f,3.3f,4.4f));
		System.out.println("Addition is "+ol.add(100,200,300,400,500));  
	}

}
