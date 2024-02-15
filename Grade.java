class Grade
{
public static void main(String [] args)
{
int CS=100;
int AI=87;
int WT=100;
int DSBDA=60;
int CNS=90;
System.out.println(CS+AI+WT+DSBDA+CNS);
double result=((CS+AI+WT+DSBDA+CNS)*100)/500;
System.out.println(result);
int per=(int)result;
char grade=(per>=90 && per<=100)?('A'):(per<90 && per>=75)?('B'):(per<75 && per>=55)?('C'):(per<55 && per>=35)?('D'):('F');
System.out.println("The student's grade:"+grade);
}
}

//
Output:
Compile time :Success
Run Time:Success:The student's grade:B
//