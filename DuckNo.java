class DuckNo
{
public static void main(String[] args)
{
int n=15401;
while(n>0)
{
int r=n%10;
if(r==0)
{
System.out.println("The number is Duck Number");
break;
}

n=n/10;
}
if(n==0)
{
System.out.println("The number is  not Duck Number");
}
}
}

