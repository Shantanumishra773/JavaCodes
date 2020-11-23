class test
{
    public void finalize()
    {
        System.out.println("Object ends");
    };
    test()
    {
        System.out.println("Hi");
    }
    test(int x)
    {
        System.out.println("Hi"+x);
    }
    public static void main(String args[])
    {
        test t=new test();
        test t1=new test(10);
        t=null;
        t1=null;
        System.gc();
    }
};
