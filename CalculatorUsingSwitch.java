import java.util.Scanner;
class CalculatorUsingSwitch

{
    public static void main(String[] args)
    {
        System.out.println("Enter the two nubers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Choose the operator:");
        char operator=sc.next().charAt(0);
        switch(operator)
        {
            case '+'->
            System.out.println("The addition is:"+(a+b));
            case '-'->
            System.out.println("The subtraction is:"+(a-b));
            case '*'->
            System.out.println("The multiplication is:"+(a*b));
            case '/'->
            System.out.println("The division is:"+(a/b));
            case '%'->
            System.out.println("The remainder is:"+(a%b));
            default->
            System.out.println("The operator is invalid");
        }

    }
}


/*
Output:
1.Compile Time:Success
2.Runtime:Success
Enter the two numbers:
45
20
Choose the operator:
/
The division is:2
*/