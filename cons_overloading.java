
class area { 
	 area(float a)
	{
		double area;
		area=Math.pow(a,2);
		System.out.println("The area of the square is: "+area);

	}
 area(float a,float b)
	{
		double area;
		area=a*b;
		System.out.println("The area of the rectangle is: "+area);

	}
  area(double b)
	{
		double area; 
		area=3.14*Math.pow(b,2);
		System.out.println("The area of the circle is: "+area);
	}
 area(float a,float b,float c)
	{
		double area;
		float s;
	s=(a+b+c)/2.0f;

		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangle is: "+area);

	}

	 

	 
	public static void main(String args[]) 
	{ 
		double s;
		area ob1 = new area(10.0f); 
		area ob2 = new area(10,20); 
		area ob3 = new area(10.0); 
		area ob4 = new area(10.0f,30.0f,35.0f);
	} 
} 
