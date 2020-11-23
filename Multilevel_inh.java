class A
{
    void show()
    {
        System.out.println("Hi, I am Grand parent");
    }
}
class B extends A
{
    void show1()
    {
        System.out.println("Hi, I am parent");
    }
}
class C extends B
{
    void show2()
    {
        System.out.println("Hi, I am child");
    }
    public static void main(String args[])
    {
        C b=new C();
        b.show();
        b.show1();
        b.show2();
    }
}
