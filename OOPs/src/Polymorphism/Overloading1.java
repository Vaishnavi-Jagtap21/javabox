package Polymorphism;

public class Overloading1 {
    
	 void Multi(int a,int b)
	 {   
		 System.out.println("Mutlipliaction of 2 int "+a+" And "+b+"  is : "+a*b);
	 }
	 void Multi(float a,float b)
	 {   
		 System.out.println("Mutlipliaction of 2 float"+a+" And "+b+" is : "+a*b);
	 }
	 void Multi(double a,double  b,double c)
	 {   
		 System.out.println("Mutlipliaction of 3 int "+a+" And "+b+" And "+c+" is : "+a*b*c);
	 }
	 void Multi(long a,long  b,long c)
	 {   
		 System.out.println("Mutlipliaction of 3 int "+a+" And "+b+" And "+c+" is : "+a*b*c);
	 }
	 void Multi(float a,float  b,float c,float d)
	 {   
		 System.out.println("Mutlipliaction of 4 float "+a+" And"+b+" And "+c+" And "+d+" is : "+a*b*c*d);
	 }
	public static void main(String[] args) {
		//Overloading
		Overloading1 ol=new Overloading1();
		ol.Multi(4,3);
		ol.Multi(4.5f,3.3f);
		ol.Multi(100,200,300);
        ol.Multi(2.4f,4.8f,5.4f,5.5f);
	}

}
