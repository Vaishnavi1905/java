import java.util.Scanner;
class TakeInput
{
public static void main(String[] args)
{
System.out.println("Enter the value:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String result=a%2==0 ? "Even":"Odd";
System.out.println("The value is:"+result);
}
}

/*
Output:
1.Compile Time:Success
2.Runtime:Success
Enter the value:
45
The value is:Odd
*/