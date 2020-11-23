
class dualclass { 

static int x,y;
	 dualclass(float r,float h)
	{
		
		System.out.println("The vol of the cylinder is: "+((3.14)*(r*r)*h));

	}
 dualclass()
	{
		float a;
		a=10.2f;
		System.out.println("The vol of the qube is: "+(a*a*a));

	}
  dualclass(double r)
	{
		System.out.println("The vol of the sphere is: "+((4/3)*(3.14)*(r*r)));
	}



	
 

	 
	public static void main(String args[]) 
	{ 
		
		dualclass ob1 = new dualclass(5.01f,10.1f); 
		dualclass ob2 = new dualclass();
		dualclass ob3 = new dualclass(5.03);
		test t=new test(10);
 		test t1 = new test(t);
 		t1.add();

		
	} 
}

 class test
 {
 static int x,y;
 test(int a)
 {
 	x=a;
 	System.out.println("Value of x is: "+x);
 }
 test(test a)
 {
 y=a.x;
System.out.println("Value of y is: "+y);

 }
 void add()
 {
 	
 	System.out.println("The increased Value of x is: "+(x+10));
 	System.out.println("The increased Value of y is: "+(y+10));
 }

 } 
