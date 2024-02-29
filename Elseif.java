class Elseif
{
    public static void main(String[] args)
    {
        int marks=70;
        {
            if(marks>=80 && marks<=100)
            {
                System.out.println("The student has got A+ grade");
            }
            else if(marks>=60 && marks<80)
            {
                System.out.println("The student has got B+ grade");
            }
            else if(marks>=40 && marks<60)
            {
                System.out.println("The student has got C+ grade");
            }
            else if(marks>=35 && marks<=40)
            {
                System.out.println("The student has got D+ grade");
            }
            else 
            {
                System.out.println("The student has got F grade");
            }
        }
    }
}



/*
Output:
1.Compile Time:Success
2.Runtime:Success
The student has got B+ grade
*/
 