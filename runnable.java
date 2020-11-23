class multi implements Runnable
{
    public void run()
    {
        System.out.println("Runnable...");
    };
    public static void main(String args[])
    {
        multi m1=new multi();
        Thread t1=new Thread(m1);
        t1.start();
    }
};

