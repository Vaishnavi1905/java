class EvilNo
{
public static void main(String args[])
{
int n=65;
int n1=n;
int binary=0;
int a=1;
int c=0;

while(n>0)
{
int rem=n1%10;
binary=binary+(a*rem);
a=a*10;
n1=n1/2;


}
System.out.println(binary);
while(n>0)
{
int rem2=n%10;
if(rem2==1)
{
c++;
}
if(c%2==0)
{
System.out.println("Evil Num");
}
else{
System.out.println("Not Evil Num");
}


}}}
