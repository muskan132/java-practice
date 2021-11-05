class Number 
{
    int n1,n2;
    Number ()
    {
        n1=n2=0;
    }
    Number (int a )
    {
        n1=n2=a;
    }
    Number (int a, int b)
    {
        n1=a;
        n2=b;
    }
    void display ()
    {
        System.out .println(n1+" "+n2);
    }
}
class sum extends Number
{
    int i,s;
    sum ()
    {
      super ();
    }
    sum (int x)
    {
        super (x);
    }
    sum (int x , int y)
    {
        super (x,y);
    }
    void calculate ()
    {
        s = n1 + n2;
    }
    void show()
    {
        display();
        System. out. println("sum is"+s);
    }
}