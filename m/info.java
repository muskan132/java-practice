import java.util.* ;
class info
{
    String na,ad;
    int ag;
    info ()
    {
        na= ad = " ";
        ag = 0;
    }
    info (String a, String b , int c)
    {
        na = a;
        ad=b;
        ag=c;
    }
    void inputinfo ()
    {
        Scanner sc = new Scanner (System.in );
        System.out.println("Enter name, adress and age");
        na = sc.nextLine();
        ad = sc.nextLine();
        ag = sc.nextInt();
    }
    void showinfo()
    {
        System.out.println("your name is " + na);
        System.out.println("Adress is"+ad);
        System.out.println("Age is"+ag);
    }
}


class student extends info
{
    double m1,m2,tot,avg;
    student ()
    {
        super ();
        m1 = m2 = 0;
    }
    student(String a, String b,int c,double d,double e )
    {
        super (a,b,c);
        m1 = d;
        m2 = e;
    }
    void inputstudent ()
    {
        Scanner sc = new Scanner (System.in );
        inputinfo();
        System.out.println ("Enter 2 marks");
        m1 = sc.nextDouble ();
        m2 = sc.nextDouble ();
    }
    void calculate ()
    {
        tot = m1 + m2 ;
        avg = tot / 2.0;
    }
    void showstudent()
    {
        showinfo ();
        System.out.println("total is" + tot);
        System.out.println("Average is" + avg);
    }
}
    class college extends student 
    {
        void check ()
        {
            inputstudent ();
            calculate ();
            showstudent();
            if (avg>=75)
            System.out.println("you are eligible");
            else
            System.out.println("not");
        }
            public static void main()
            {
                college obj = new college();
                obj.check();
            }
        }
    
 