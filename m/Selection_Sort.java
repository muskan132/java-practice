import java. util.*;
class Selection_Sort
{
    public static void main () 
    {
         Selection_Sort sr = new Selection_Sort ();
        Scanner sc = new Scanner (System.in);
        int a [] = new int [10];
        int i=0;
        for ( i=0;i<10;i++)
        {
            System.out.println("Enter a number");
            a[i]=sc.nextInt ();
        }
        
        
        sr.selection(a);
       
    }

void selection (int a [])
    {
        int m=0,tmp=0;
        for (int i=0; i<a.length-1;i++)
        {
            m=i;
            for (int j=i+1;j<a.length;j++)
            {
                if(a[m]>a[j])
                {
                    m=j;
                }
            }
            tmp=a[m];
            a[m]=a[i];
            a[i]=tmp;
        }
            for(int i=0;i<a.length;i++)
             System.out.println(a[i]);
            }
        }