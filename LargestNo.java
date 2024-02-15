class LargestNo
{
public static void main(String[] args)
{
int a=98,b=23,c=45,d=10;
int max=a>b ?(a>c ? (a>d ? a:d):(c>d ? c:d)):(b>c ? (b>d ? b:d):(c>d ? c:d));
System.out.println("The largest number among 98,23,45 and 10 is:"+max);
}
}


//
Output:
Compile Time:Success
Runtime:Success:
The largest number among 98,23,45 and 10 is:98
//