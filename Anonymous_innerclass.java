interface A
{
    int x=10;
    public void show();
}
class test
{
    public static void main(String args[])
    {
        A a=new A()
        {
            public void show()
            {
                System.out.println("X="+x);
            }
        };
        a.show();
    };
};
