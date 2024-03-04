class NestedSwitch
{
    public static void main(String[] args)
    {
        int num=123;
        int key=3;
        switch(key)
        {
            case 1:
            if(num%2==0)
            {
                System.out.println("The number is even");
            }
            else
            {
                System.out.println("The number is odd");
            }
            break;

            case 2:
            if(num%7==0 || num%10==7)
            {
                System.out.println("The number is buzz number");
            }
            else
            {
                System.out.println("The number is not buzz number");
            }
            break;

            case 3:
            if(num>0)
            {
                System.out.println("The number is positive");
            }
            else
            {
                System.out.println("The number is negative");
            }
            break;

            case 4:
            if(num>=10 && num<=99)
            {
                System.out.println("The number is two digit number");
            }
            else
            {
                System.out.println("the number is not two digit number");
            }
            break;
        }
    }
}



/*
Output:
1.Compile Time:Success
2.Runtime:Success
The number is positive
*/