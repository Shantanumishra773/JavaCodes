import java.io.Console;
class Test
{
    int sum,num1,num2;
    Test(int x,int y)
    {
        sum=0;
        num1=x;
        num2=y;
    }
    void add()
    {
        sum=num1+num2;
    }
    void show()
    {
        System.out.println("Addition="+sum);
    }
    public static void main(String args[])
    {
        int a,b;
        Console s=System.console();
        a=Integer.parseInt(s.readLine());
        b=Integer.parseInt(s.readLine());
        Test t=new Test(a,b);
        t.add();
        t.show();
    }
};

