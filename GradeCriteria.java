class GradeCriteria
{
public static void main(String[] args)
{
int marks=33;
char grade=(marks>=90 && marks<=100)?('A'):(marks<90 && marks>=75)?('B'):(marks<75 && marks>=55)?('C'):(marks<55 && marks>=35)?('D'):('F');
System.out.println("According to grade criteria, the student has got grade:"+grade);
}}


/*
Output:
1.Compile Time:Success
2.Runtime:Success
According to the grade criteria, the student has got grade:F
*/