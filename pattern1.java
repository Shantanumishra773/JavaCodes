import java.util.Scanner;
class pattern1{
public static void main (String args[]){
Scanner scan=new Scanner(System.in);
//create a scanner object for input
System.out.print("Enter the number of rows: ");
int rows=scan.nextInt();//reads rows from user
for(int i=1; i<=rows; i++){    //print upper part
    for(int j=1; j<=rows-i; j++){
      System.out.print(" ");
}
for(int k=1; k<=i+2; k++){
      System.out.print("*"+" ");//print star with space
}
System.out.println();
}
for(int i=1; i<=rows-1; i++){  //print lower part
    for(int j=1; j<=i; j++){
      System.out.print(" ");
}
for(int k=1; k<=rows+1-i; k++){
      System.out.print("*"+" ");//print star with space
}
System.out.println();
        }
    }
}