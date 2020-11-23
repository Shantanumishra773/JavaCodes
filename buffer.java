import java.io.*;
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
    public static void main(String args[])throws IOException
    {
        int a,b;
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(obj.readLine());
        b=Integer.parseInt(obj.readLine());
        Test t=new Test(a,b);
        t.add();
        t.show();
    }
};

