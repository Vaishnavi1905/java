class IncomeTax
{
public static void main(String []args)
{
double income=90000;
double tax=0;
if(income <=30000)
{
tax=(income*0.10);
System.out.println("IncomeTax:"+tax);
}
else if(income <=40000)
{
tax=(income*0.20);
System.out.println("IncomeTax:"+tax);
}
else if(income>=50000)
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
//output
compile time -success
Run time-IncomeTax:27000.0