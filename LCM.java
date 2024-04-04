class LCM
{
public static void main(String[] args)
{
int a=20;
int b=30;
int r=a;
int y=b;
if(a>b)
{


while(true)
{
if(a%r==0 && a%b==0)
{

System.out.println("LCM of given number is:"+a);
break;
}

a++;

}

}

else
{
while(true)
{
if(b%y==0 && b%a==0)
{
System.out.println("LCM of given number is:"+b);
break;
}

b++;

}

}
}

}