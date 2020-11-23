class prime
{
public static void main(String args[])
{
int n=13,i,j=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
{
j++;
break;
}
}
if(j==1)
{
System.out.print("prime");
}
else
{
System.out.print("not prime");
}
}
}