class square extends shape
{
    void area(double a)
    {
        area1=a*a;
        System.out.println("The area of square is= "+area1);
    }
    void peri(double a)
    {
        peri1=4*a;
        System.out.println("The perimeter of square is= "+peri1);
    }
}
class rectangle extends shape
{
    void area(double l, double b)
    {
        area1=l*b;
        System.out.println("The area of rectangle is= "+area1);
    }
    void peri(int l, int b)
    {
        peri1=2*(l+b);
        System.out.println("The perimeter of rectangle is= "+peri1);
    }
}
class circle extends shape
{
    void area(float r)
    {
        area1=3.141*r*r;
        System.out.println("The area of circle is= "+area1);
    }
    void peri(float r)
    {
        peri1=2*3.141*r;
        System.out.println("The perimeter of circle is= "+peri1);
    }
}
class Test
{
    public static void main(String args[])
    {
        square s=new square();
        rectangle r=new rectangle();
        circle c=new circle();
        s.area(3);
        s.peri(3);
        r.area(6,5);
        r.peri(6,5);
        c.area(2.5f);
        c.peri(2.5f);
    }
}
class shape
{
    void area(){}
    void peri(){}
    double area1;
    double peri1;
};

