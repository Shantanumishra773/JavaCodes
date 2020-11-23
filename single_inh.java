class A
{
    void show()
    {
        System.out.println("Hi, I am parent");
    }
}
class B extends A
{
    void show1()
    {
        System.out.println("Hi, I am child");
    }
    public static void main(String args[])
    {
        B b1=new B();
        b1.show();
        b1.show1();
    }
}

