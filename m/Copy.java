import java .io.*;
class Copy
{
    public static void main ()
    {
        try
        {
            FileInputStream fist = new FileInputStream ("stu.dat");
            DataInputStream dist = new DataInputStream (fist);
            FileOutputStream fost = new FileOutputStream ("Stu2.dat",true);
            DataOutputStream dost = new DataOutputStream (fost);
            String n;
            int r;
            float t;
            try
            {
                while (true)
                {
                    n = dist.readUTF ();
                    r = dist.readInt();
                    t = dist.readFloat();
                    dost.writeUTF(n);
                    dost.writeInt(r);
                    dost.writeFloat(t);
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
            catch (Exception f)
            {
                System.out.println(f);
            }
        }
    }
                
                
                    
