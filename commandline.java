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
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        Test t=new Test(a,b);
        t.add();
        t.show();
    }
};
