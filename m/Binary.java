import java.io.*;
public class Binary
{
    void output()
    {
        String fileName = "stu.dat";
        InputStreamReader isr = new InputStreamReader(System.in);//binary reading
        BufferedReader stdin = new BufferedReader (isr);
        try
        {
            int rno=0;
            float marks=0.0f;
            FileOutputStream fw = new FileOutputStream (fileName);
            DataOutputStream dw = new DataOutputStream (fw);
            for (int i = 0 ; i<5; i++)
            {
                System . out . println("Enter Rollno");
                rno = Integer.parseInt(stdin.readLine());
                System.out.println("enter Marks :");
                marks = Float.parseFloat(stdin.readLine());
            }
                dw.writeInt(rno);
                dw.writeFloat(marks);
            }
            catch (IOException e)
            {
              System.out.println(e);
            }
            boolean Eof= false;
            try
            {
              FileInputStream fr = new FileInputStream (fileName);
              DataInputStream dr = new DataInputStream (fr);
              while(!Eof)
              {
            try
            {
              int rno;
              float marks;
              rno = dr.readInt();
              System.out.println("Roll no :"+rno);
              marks = dr.readFloat ();
              System.out.println("Marks :"+marks);
              
            }
            
            catch (IOException e)
            {
                System.out.println(e);
            }
        }
    }
    catch (FileNotFoundException e)
    {
        System.out.println("file not found");
    }
}
void input() throws IOException
{
    FileOutputStream fos= new FileOutputStream("Names.dat");
    DataOutputStream dos=new DataOutputStream(fos);
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    String na;
    int age,i;
    for(i=1;i<=3;i++)
    {
        System.out.println(" Enter name and age");
        na=br.readLine();
        age=Integer.parseInt(br.readLine());
        dos.writeUTF(na);
        dos.writeInt(age);
    }
}

}