interface a{
	int a=10;
}
interface b extends a{
	int b=20;
public void calculate();
 void show();
}
class N implements b{
	int c;
	public void calculate(){
	
	c=a+b;
}
	public void show(){
		System.out.println("the total is:"+c);
	}
	
	public static void main(String args[]){
		N n= new N();
		n.show();
	}
}