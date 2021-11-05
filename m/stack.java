 import java.io.*;
class stack
{
    int a[]=new int[10];
    int i=0;
    void push(int x)
    {
        if(i<a.length)
            a[i++]=x;
        else
            System.out.println("stack overloaded");
    }

    void pop()
    {
        if(i==0)
            System.out.println("there is nothing to pop in the array");
        else
        {
            System.out.println("the popped element "+a[--i]);
            a[i]=0;
        }

    }

    void print()
    {
        if(i==0)
        System.out.println("stack is empty");
        for(int j=i-1;j>=0;j--)
        {
            System.out.println(a[j]);
        }
    }

    void count()
    {
        System.out.println("the number of elements in the stack are "+i);
    }

    public static void main()throws IOException
    {
        int ch=0,n=0;
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        stack st=new stack();
        while(ch!=5)
        {
            System.out.println("input \n1. for push,\n2. for pop,\n3. for printing the elements of the stack,\n4. for counting the elements,\n5. for exiting");
            ch=Integer.parseInt(ob.readLine());
            switch(ch)
            {
                case 1:
                System.out.println("enter a number");
                n=Integer.parseInt(ob.readLine());
                st.push(n);
                break;
                case 2:
                st.pop();
                break;
                case 3:
                st.print();
                break;
                case 4:
                st.count();
                break;
                case 5:
                System.out.println("Exiting");
                break;
                default:
                System.out.println("please check your choice");
            }
        }
    }
}

       
       