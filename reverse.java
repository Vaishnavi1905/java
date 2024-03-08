class reverse {
    public static void main(String [] args)
    {
        int a=2345;
        int r=0;
        do
        {
            int remainder=a%10;
            r=r*10+remainder;
            a=a/10;
        }while(a>0);
        System.out.print(r);

    }
    
}
