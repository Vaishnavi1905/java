import java.util.Scanner;
class Swappingwithoutvariable
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("The numbers before swapping are x=" +x+"and y= "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("The numbers after swapping are x="+x+" and y= "+y);

    }
}

/*Output:
1.Compile Time:Success
2.Runtime:Success
Enter the numbers:
23
90
The numbers before swapping are x=23and y= 90
The numbers after swapping are x=90 and y= 23
*/