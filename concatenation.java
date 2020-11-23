import java.io.*;
class concatenation
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first string");
        String s1=ob.readLine();
        System.out.println("Enter the second string");
        String s2=ob.readLine();
        String s3=s1.concat(s2);
        System.out.println("Concatenated String is:"+s3);
    };
};
