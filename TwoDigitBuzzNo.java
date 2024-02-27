import java.util.Scanner;
class TwoDigitBuzzNo
{
 public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int a=sc.nextInt();

  if(a>=10 && a<=100)
   {
     if(a%7==0 || a%10==7)
       {
        System.out.println("The number is a Buzz number");
       }
     else
       {
        System.out.println("The number is not a Buzz number");
       }
   }

  else
   {
     

     System.out.println("This is not a two digit number");
   

   }


}

}

  


/*
Output:
1.Compile Time:Success
2.Runtime:Success
Enter the number:
77
The number is a Buzz number
*/