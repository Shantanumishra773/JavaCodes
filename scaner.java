import java.util.Scanner;
class sum
{
int n1,n2,s;
sum(int x,int y)
{
n1=x;
n2=y;
}
void display()
{
System.out.println(n1+n2);
}
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
sum s=new sum(a,b);
s.display();
}
}