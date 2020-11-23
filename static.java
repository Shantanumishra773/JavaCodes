class Test
{
    static
    {
        System.out.println("SKFGI");
    }
    static int a=5;
    Test()
    {
        a=a+1;
    }
    static void show()
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Test t=new Test();
        Test.show();
    }
};
