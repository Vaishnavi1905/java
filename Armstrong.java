class Armstrong
{
public static void main(String[] args){
int a=153;
int numcopy=a;
int numcopy1=a;
int count=0;

while(a>0)
{
count++;
a=a/10;
}
int result=0;
while(numcopy>0)
{
int base=numcopy%10;
int product=1;
for(int i=1;i<=count;i++)
{
product=product*base;
}result=result+product;
numcopy=numcopy/10;


}
System.out.println(result);
if(result==numcopy1)
{
System.out.println("The num is Armstrong num");

}
else
{
System.out.println("The num is not Armstrong num");
}
}
}




