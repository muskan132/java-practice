class series1
{
    public static void main(int n)
    {
        double sum =1,j=2,fact=1;
        int i=0;
        for (i=2;i<=n;i++)
        {
            fact=fact*i;
            sum=sum+(j/fact);
            j= Math.pow(j,i);
        }
                System.out.println("The sum of the series is "+sum);
            }
        }
        