import java.io.*;
class circular_queue
{
    int a[]=new int[4];
    int rear=0,front=0,front2=0,l=a.length,c=0,l2=0;
    void add(int x)
    {
        if(rear<l)
        {
            a[rear++]=x;
            c++;
        }
        else if(front>0)
        {
            l=front;
            rear=0;
            a[rear++]=x;
            c++;
        }
        else
        {
            System.out.println("Queue overloaded");
        }

    }

    void remove()
    {
        if(front==a.length)
        {
            front=0;
        }
        if(front==rear)
            System.out.println("queue is empty");

        else
        {
            System.out.println("the element to be removed is "+a[front]);
            a[front++]=0;
            c--;
        }
    }

    void count()
    {
        System.out.println("the number of elements in the array are "+c);
    }

    void print()
    {
        for(int i=front;i<rear;i++)
        {
            System.out.println(a[i]);
        }
        if(l!=a.length)
        {
            for(int i=0;i<rear;i++)
            {
                System.out.println(a[i]);
            }
            for(int i=front;i<a.length;i++)
            {
                System.out.println(a[i]);
            }

        }
    }

    public static void main()throws IOException
    {
        int ch=0,n=0;
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        circular_queue cqu=new circular_queue();
        while(ch!=5)
        {
            System.out.println("input \n1. for input\n2. for remove\n3. for printing the elements of the queue\n4. for counting the elements\n5. for exiting");
            ch=Integer.parseInt(ob.readLine());
            switch(ch)
            {
                case 1:
                System.out.println("enter a number");
                n=Integer.parseInt(ob.readLine());
                cqu.add(n);
                break;
                case 2:
                cqu.remove();
                break;
                case 3:
                cqu.print();
                break;
                case 4:
                cqu.count();
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