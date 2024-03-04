import java.util.Scanner;
class Swapping
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("The numbers before swapping are x=" +x+"and y= "+y);
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("The numbers after swapping are x="+x+" and y= "+y);

    }
}

/*Output:
1.Compile Time:Success
2.Runtime:Success
Enter the numbers:
23
11
The numbers before swapping are x=23and y= 11
The numbers after swapping are x=11 and y= 23
*/