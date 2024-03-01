class IncomeTax
{
public static void main(String []args)
{
double income=90000;
double tax=0;
if(income <=2.5L)
{
tax=(income*0.10);
System.out.println("IncomeTax:"+tax);
}
else if(income <=5.0L)
{
tax=(income*0.20);
System.out.println("IncomeTax:"+tax);
}
else if(income>=10L)
{
tax=(income*0.30);
System.out.println("IncomeTax:"+tax);
}
else
{
System.out.println("Income Tax:"+tax);
}
}
}
