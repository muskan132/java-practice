class twin_prime
{
    public static void main (int n)
    {
        int m = n+2 , i=0 ,c1=0,c2=0;
        
        for (i=2;i<=Math.max(m,n);i++)
        {
            if (m%i==0)
            c1++;
            if (n%i==0)
             c2++;
            }
            if (c1<1 && c2<1)
                    System.out.println("The number is  twin prime");
                    else
                            System.out.println("The number is not a twin prime");
                        }
                    }
             
    
        