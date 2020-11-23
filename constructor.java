class add
{
    int x;
    add(int y)
    {
    x=y;
    }
 add(add a)
 {
     x=a.x+10;
 }
 add(int a,int b)
 {
     System.out.println("Add= "+(a+b));
 }
 add()
 {
     float a,b;
     a=2.5f;
     b=4.7f;
     System.out.println("Add= "+(a+b));
 }

 void display()
{
System.out.println(x);
}
 public static void main(String args[])
 {
     add t=new add(10,20);
     add t1=new add();
     add c=new add(5);
     c.display();
     add c1=new add(c);
     c1.display();
 }
}
