
class compare
{
    int fact_recursion (int n)
    {
        if (n==1)
        return 1;
        else
        return (n*fact_recursion(n-1));
    }
    int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
          fact=fact*i;
        }
        return fact;
    }
    public static void main()
    {
        int n=100;
        compare cp=new compare();
        long start1=System.currentTimeMillis();
        cp.factorial(n);
        long stop1=System.currentTimeMillis();
        System.out.println(" Time taken by the normal function of factorial is equal to " + (stop1-start1));
        long start2=System.currentTimeMillis();
        cp.fact_recursion(n);
        long stop2=System.currentTimeMillis();
        System.out.println(" Time taken by the recursive function of factorial is equal to " + (stop2-start2));
    }
}