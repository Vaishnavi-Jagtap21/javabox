package Encapsulation;

 class Area
{
	int length,breadth;
	
	//Constructor
	Area(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	void getArea()
	{
		int area=length*breadth;
		System.out.println("Area OF Reactangle Having : "+ length +" and "+ breadth +" is "+ area);
	}
}
public class Rectangle {

	public static void main(String[] args) {
		// Area of Rectangle
		Area ar=new Area(17,12);
		ar.getArea();
		System.out.println(ar.length);
		System.out.println(ar.breadth);
	}

}
