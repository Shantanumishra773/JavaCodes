class test1
{
    void print()
    {
        System.out.println("Test1 class");
    }
};
interface test
{
    int a=10;
    void show();
}
class A  extends test1 implements test
{
     public void show()
    {
        System.out.println("Hi");
    }
    public static void main(String args[])
    {
        test t=new A();
        t.show();
        A a=new A();
        a.print();
    }
};
