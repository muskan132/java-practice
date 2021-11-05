import java.util.*;
class Pallindrome
{
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("input a word");
        String s = sc.nextLine();
        int i=0;
        String new2="";
        char ch=' ';
        for(i=s.length()-1;i>=0;i--)
        {
            ch=s.charAt(i);
            new2=new2+ch;
        }
        if(s.equals(new2))
                System.out.println(s+" Is a pallindrome");
                else
                        System.out.println(s+" Is not a pallindrome");
                    }
                }
            