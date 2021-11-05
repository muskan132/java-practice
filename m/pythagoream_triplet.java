import java.io.*;
class pythagoream_triplet
{
    public static void main ()throws IOException
    {
        BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 3 number in ascending order");
        int a = Integer.parseInt(ob.readLine());
        int b = Integer.parseInt(ob.readLine());
        int c = Integer.parseInt(ob.readLine());
        if(c*c==b*b+a*a)
        {
            System.out.println("These 3 numbers are pythagorean triplets");
        }
        else
        {
            System.out.println("These 3 numbers are not pythagorean triplets");
        }
    }
}
         
  