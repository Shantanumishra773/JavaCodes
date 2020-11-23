class test extends Thread {
public void run()
{
for(int i=0;i<5;i++)
{
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String args[])
{
test t1=new test();
test t2=new test();
t1.start();
try{
t1.join();
}
catch(Exception e)
{
System.out.println(e);
}
t2.start();
}
}
