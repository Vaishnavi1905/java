import java.util.Scanner;
class SmallProject 
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose college:");
        System.out.println("1.In Hometown");
        System.out.println("2.In India");
        System.out.println("3.In World");
        System.out.println("4.Remote");
        System.out.println("Enter the key:");
        int key=sc.nextInt();
        System.out.println("Enter the percentage:");
        int percentage=sc.nextInt();
        System.out.println("Enter the grade:");
        char grade=sc.next().charAt(0);

        switch(key)
        {
            case 1:

            if(percentage>70 || grade=='B')
            {
                System.out.println("You can get college in your hometown");
            }
            else
            {
                System.out.println("You can get college in your hometown");

            }
            break;

            case 2:
            
            if(percentage>=60 || grade=='A')
            {
                System.out.println("You can get college in India");
            }
            else
            {
                System.out.println("You can not get college in India because your grade is not A");

            }
            break;

            case 3:
            
            if(percentage>90 && grade=='A')
            {
                System.out.println("You can get college in world");
            }
            else
            {
                System.out.println("You can not get college in world");

            }
            break;

            case 4:
            
            if(percentage>35)
            {
                System.out.println("You can get remote college ");
            }
            else
            {
                System.out.println("You can not get remote college");

            }
            
        }

        
        
        


    }
}
    

/*
 Output:
 1.Compile Time:Success
 2.Runtime:Success
 Choose college:
1.In Hometown
2.In India
3.In World
4.Remote
Enter the key:
2
Enter the percentage:
60
Enter the grade:
C
You can get college in India
 */