import java. util.*;
class Insertion_Sort
{
    public static void main () 
    {
         Insertion_Sort sr = new Insertion_Sort ();
        Scanner sc = new Scanner (System.in);
        int a [] = new int [10];
        int i=0;
        for ( i=0;i<10;i++)
        {
            System.out.println("Enter a number");
            a[i]=sc.nextInt ();
        }
        
        
        sr.insertion(a);
    }
     void insertion(int a[])
            {
                int i,t=0 , j=0;
                for (i=1;i<a.length;i++)
                {
                    j=i;
                    t=a[j];
                    while(j>0&&a[j-1]>t)
                    {
                        a[j]=a[j-1];
                        j--;
                    }
                    a[j]=t;
                }
                for(i=0;i<a.length;i++)
                System.out.println(a[i]);
            }
        }
