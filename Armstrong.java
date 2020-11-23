class armstrong
{
public static void main(String args[])
{
    int i,n=153,s=0,d=0;
    i=n;
    while(n!=0)
    {
        d=n%10;
        s=s+(d*d*d);
        n=n/10;
    }
    if(s==i)
        System.out.println("Armstrong Number");
    else
        System.out.println("Not a Armstrong Number");
}
}
