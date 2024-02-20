import java.util.Scanner;
class CompareIntChar
{
public static void main(String[] args)
{
char ch='V';
System.out.println("Enter the value:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String result=(a==ch) ? "a is equal to ch":"a is not equal to ch";
System.out.println(result);
}
}


/*
Output:
1.Compile Time:Success
2.Runtime:
Enter the value:
23
a is not equal to ch
*/