import java.util.Scanner;
class TechNum
{
public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

int div=1;
int numcopy=a;
int numcopy1=a;
int numcopy2=a;
int count=0;
while(a>0)
{
count++;
int r=a%10;
a=a/10;
}
if(count%2==0)
{
for(int i=1;i<=count/2;i++)
{

div=div*10;

}
int sum=0;
int c=numcopy/div;
int d=numcopy1%div;
System.out.println("The first half is:"+c);
System.out.println("The second half is:"+d);
sum=c+d;

if(sum*sum==numcopy2)
{
System.out.println("The number is tech number");

}
else
{
System.out.println("The number is not tech number");

}}else
{
System.out.println("The number is having odd number of digits");
}

}
}