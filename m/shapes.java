class shapes 
{
    public static void main ()
    {
        for (int i =1;i<=5;i++)
        {
            for (int j =1 ;j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i =1;i<=5;i++)
        {
            for (int j = 6-i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=0; i<=4; i++)
        {
            for (char j = 'A';j<='E';j++)
            {
              System.out.print(j);  
            }
            System.out.println();
        }
        char a='A' ;
        for (int i = 1 ; i<=5;i++ )
        {
            for (int j = 1; j<=i;j++)
            {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
        for (int i = 1; i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int k = 1 + i; k<=5;k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
            
  