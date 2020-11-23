class parent
{
    double inc;
    parent()
    {
        inc=50000.00;
    }
    void show()
    {
        System.out.println("Income of parent= "+inc);
    }
}
class child extends parent
{
    double cinc;
    child()
    {
        super();
        cinc=20000.00;
    }
    void show1()
    {
        System.out.println("Income of child= "+cinc);
    }
    void income()
    {
        System.out.println("Total Income= "+(inc+cinc));
    }
    public static void main(String args[])
    {
        child c=new child();
        c.show();
        c.show1();
        c.income();
    }
}
