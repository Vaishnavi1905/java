class HarshadNo
{
public static void main(String[] args)
{
int n=54;
int numcopy=n;
int sum=0;

while(n>0)
{
int r=n%10;
sum=sum+r;
n=n/10;
}
if(numcopy%sum==0)
{
System.out.println("The number is Harshad Number");
}
else
{
System.out.println("The number is  not Harshad Number");
}
}
}