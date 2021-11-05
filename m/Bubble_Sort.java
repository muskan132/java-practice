import java. util.*;
class Bubble_Sort
{
    public static void main () 
    {
         Bubble_Sort sr = new Bubble_Sort ();
        Scanner sc = new Scanner (System.in);
        int a [] = new int [10];
        int i=0;
        for ( i=0;i<10;i++)
        {
            System.out.println("Enter a number");
            a[i]=sc.nextInt ();
        }
        
        sr.bubble (a);
        
    }

    void bubble (int a[])
    {
        int j=0,i=0,tmp;
        for (i=1;i<a.length;i++)
        {
            for(j=0;j<a.length-i;j++)
            {
                if (a[j] > a[j+1])
                {
                    tmp = a [j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for (i=0;i<a.length;i++)
            System.out.println (a[i]);
    }
}
    
           
                    
            
 