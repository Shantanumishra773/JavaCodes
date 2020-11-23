interface test
{
    int a=10;
    void show();
}
interface test1
{
    int b=20;
    void show1();
}
class A  implements test,test1
{
     public void show()
    {
        System.out.println("The value of a="+a);
    }
     public void show1()
    {
        System.out.println("The value of b="+b);
    }
    public static void main(String args[])
    {
        A t=new A();
        t.show();
        t.show1();
    }
};
