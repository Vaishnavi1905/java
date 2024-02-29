class NestedIfElse
{
public static void main ( String [] args)
{
int age=25;
int hemoglobin=13;
boolean no_disease=true;
boolean drugs_addict=false;

if(age>18 && age<65)
{

if(hemoglobin>=13)
{

if(no_disease==true)
{

if(drugs_addict==false)
{
System.out.println("You are eligible to donate blood");
}
else
{
System.out.println("You are not eligible to donate blood because you're drugs_addict");
}
}
else
{
System.out.println("You are not eligible to donate blood because you have disease");
}
}
else
{
System.out.println("You are not eligible to donate blood because your hemoglobin is less than 13");
}
}
else
{
System.out.println("You are not eligible to donate blood because your age is not according to criteria");
}
}
}


/*
Output:
1.Compile Time:Succes
2.Runtime:Success
You are eligible to donate blood
*/
