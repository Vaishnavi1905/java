class ConditionalOp
{
public static void main(String[] args)
{
int a=34,b=40;
int c=a+b;
int d=c/10;
int e=c%10;
int f=d+e;
String h=f%2==1?"F is odd": "F is even";
System.out.println(h);
}}


/*
1.Compile Time:Success
2.Run Time:Success:F is odd
*/