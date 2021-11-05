import java.io.*;
public class IO
{
    static String fileName = ("names.txt");
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader stdin = new BufferedReader (isr);
    public static void main () throws IOException
    {
        try
        {
            FileWriter fw = new FileWriter (fileName);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter outFile = new PrintWriter (bw);
            for (int i = 0;i<5;i++)
            {
                System.out.println("enter name");
                String name = stdin. readLine();
                outFile.println(name);
            }
            outFile.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        FileReader file = new FileReader ("name.txt"); //text reader
        BufferedReader fileInput = new BufferedReader (file);
        String text;
        int i = 0;
        while((text = fileInput.readLine())!= null)
        {
            i++;
            System.out.println("Name" + i + ":");  
            System.out.println(text);  
        }
        fileInput.close();
    }
} 