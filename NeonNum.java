class NeonNum
{
public static void main(String[] args)
{
int a=9;

int square=a*a;
int r=0;
int sum=0;
while(square>0)
{
 r=square%10;
square=square/10;
 sum=sum+r;
}


if(sum==a)
{
System.out.println("The number is Neon number");
}
else
{
System.out.println("The number is not Neon number");
}
}}