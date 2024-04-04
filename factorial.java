public class factorial {
    public static void main(String[] args)
    {
        int start=2;
        

while(start<9)
{
int num=start;
int fact=1;


        while(num>0)
        {
          fact=fact*num;
          num--;
          
          
        }
        System.out.println(fact);
  start++;

    }
    
}}
