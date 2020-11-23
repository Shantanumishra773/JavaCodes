class A
{
    class B
    {
        void show()
        {
            System.out.println(10);
        }
    };
    public static void main(String args[])
    {
        A a=new A();
        A.B b=a.new B();
        b.show();
    }
};
