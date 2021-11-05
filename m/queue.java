import java.io.*;
class queue
{
    int a[]=new int[10];
    int rear=0,front=0;
    void add(int x)
    {
        if(rear<a.length)
            a[rear++]=x;
        else
        {
            System.out.println("Queue overloaded");
        }

    }

    void remove()
    {
        if(front==rear)
            System.out.println("queue is empty");
        else
        {
            System.out.println("the element to be removed is "+a[front]);
            a[front++]=0;
        }
    }

    void count()
    {
        System.out.println("the number of elements in the array are "+(rear-front));
    }

    void print()
    {
        for(int i=front;i<rear;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main()throws IOException
    {
        int ch=0,n=0;
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        queue qu=new queue();
        while(ch!=5)
        {
            System.out.println("input \n1. for input\n2. for remove\n3. for printing the elements of the queue\n4. for counting the elements\n5. for exiting");
            ch=Integer.parseInt(ob.readLine());
            switch(ch)
            {
                case 1:
                System.out.println("enter a number");
                n=Integer.parseInt(ob.readLine());
                qu.add(n);
                break;
                case 2:
                qu.remove();
                break;
                case 3:
                qu.print();
                break;
                case 4:
                qu.count();
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

           
                
    
        