class cab
{
int f,d;
cab(int d1)
{
f=0;
d=d1;
}
void calculate()
{
if(d<=4)
f=f+50;
else if (d>4 && d<=10)
f=f+50+(d-4)*7;
else if (d>10 && d<=20)
f=f+50+(d-10)*8 +6*7;
else if (d>20)
f=f+50+(d-20)*10+10*8+6*7;
}
void display()
{
System.out.print("distance :" + "\t" + d+ "\t" + "fare:"+"\t"+f);
}
public static void main(String args[])
{
cab obj=new cab(25);
obj.calculate();
obj.display();
}
}
