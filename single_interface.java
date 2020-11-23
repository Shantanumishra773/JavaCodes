interface test
{
    int a=10;
    void show();
}
class A implements test
{
    public void show()
    {
        System.out.println("Hi");
    }
    public static void main(String args[])
    {
        test t=new A();
        t.show();
    }
};
