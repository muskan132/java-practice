class Recursion
{
    int fact (int n)
    {
        if (n==1)
        return 1;
        else
        return (n*fact(n-1));
    }
    int fibro(int n)
    {
        if (n==1)
        return 0;
        else if(n==2)
        return 1;
        else 
        return(fibro(n-1) + fibro(n+2));
    }
    float raise (float num, int power)
    {
        if (power==1)
        return num;
        else if(power==0)
        return 1;
        else 
        return (num + raise(num, power-1 ));
    }
    int prodeven(int n)
    {
        int p = 1;
        if (n == 2 )
        return 1;
        else
        return ((n*2) * prodeven(n-1));
    }
    int reverse(int n,int c )
    {
        if (n<10)
        return n;
        else 
        return ((int)(n%10*Math.pow(10,c)) + reverse (n/10,c-1));
    }
    int gcd (int a , int b )
    {
        if (b==0)
        return a;
        else 
        return (gcd(b, a%b));
    }
    int decbin (int n )
    {
        if (n == 0)
        return 0;
        else if (n==1)
        return 1;
        else
        return (n %2 + decbin(n/2)*10);
    }
    public static void main (int a, int b, int c, int d,float e )
    {
        Recursion re = new Recursion ();
        System.out.println(re.fact(a));
        for(int i = 1;i<=10;i++)
        {
          System.out.println(re.fibro(i));
        }
          System.out.println(re.raise(e,d));
          System.out.println(re.prodeven(b));
          System.out.println(re.reverse(a,c));
          System.out.println(re.gcd(a,b));
          System.out.println(re.decbin(a));
        
    }
}

    
        
 