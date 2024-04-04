class DecimalNo
{
public static void main(String[] args)
{
int n=1000001;
int n1=0;
int a=1;
while(n>0)
{
int rem=n%10;
n1=n1+(a*rem);
n=n/10;
a=a*2;

}
System.out.println(n1);
}
}


