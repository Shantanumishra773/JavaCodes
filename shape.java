
class shape { 
	void area(float a)
	{
		double area;
		area=Math.pow(a,2);
		System.out.println("The area of the square is: "+area);

	}
void area(float a,float b)
	{
		double area;
		area=a*b;
		System.out.println("The area of the rectangle is: "+area);

	}
 double area(double b)
	{
		double area;
		area=3.14*Math.pow(b,2);
		return area;
	}
void area(float a,float b,float c)
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
		shape ob = new shape(); 
		ob.area(10.0f);
		ob.area(10,20);
		s=ob.area(10.0);
		System.out.println("The area of the circle is: "+s);
		ob.area(10.0f,30.0f,35.0f); 
	} 
} 
