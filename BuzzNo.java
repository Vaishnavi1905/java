import java.util.Scanner;

class BuzzNo
//To find Buzz No which is of two digits only 
{
public static void main(String[] args)
{
System.out.println("Enter the value:");
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();

String result=(a>9 && a<=99) ?(a%7==0 || a%10==7 ? "Buzz No":"Not Buzz No"):("Invalid No");
System.out.println(result);
}
}

/*
Output:
1.Compile Time:Success
2.Runtime:Success
Enter the value:
777
Invalid No
*/