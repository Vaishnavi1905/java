import java.util.Scanner;

class IncomeTax {
    public static void main(String[] args)
  {
        float income = 0.0f; // Declare income variable
        float tax = 0.0f; // Declare tax variable
        System.out.println("Enter the income:");
        Scanner sc = new Scanner(System.in);
        income = sc.nextFloat(); // Assign user input to income variable

        if (income < 2.5f)
        {
            tax = 0.0f;
            System.out.println("IncomeTax:" + tax);
        } else if (income <= 5.0f) 
        {
            tax = (income * 0.20f);
            System.out.println("IncomeTax:" + tax);
        } 
        else if (income >= 10.0f)
        {
            tax = (income * 0.30f);
            System.out.println("IncomeTax:" + tax);
        }
        else {
            System.out.println("Income Tax:" + tax);
        }
    }
}






