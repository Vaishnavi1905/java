class HCF
{
public static void main(String[] args)
{
int a=20;
int b=30;
int r=a;
int y=b;
if(a>b)
{
for(int i=2;i<=b;i++)
{
int r=a%10;
if(r==0)
{
System.out.println(i);
break;
}
}
}
else
{
for(int i=2;i<=a;i++)
{

System.out.println(i);
break;
}
}


}}