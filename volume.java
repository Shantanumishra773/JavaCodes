class volume
{
void volume(float r,float h)
{
System.out.println("volume of cylinder ="+(0.314*r*r*h));
}
void volume (int a)
{
System.out.println("volume of cube ="+(a*a*a));
}
void volume(float r)
{
System.out.println("volume of sphere ="+((4/3)*3.14*r*r));
}
public static void main(String args[])
{
volume t= new volume();
t.volume(3.5f,4.5f);
t.volume(3);
t.volume(7.5f);
}
}
