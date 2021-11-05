import java.io.*;
class encryption
{
    String change(String s)
    {
        char ch;
        String wd="";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                ans=ans+wd+" " ;
                wd="";
            }
            else
            {
                if(ch=='Y')
                ch='A';
                else if(ch=='Z')
                ch='B';
                else
                ch=(char)(ch+2);
                wd=wd+ch;
            }
        }
        return ans;
    }
    String change2(String s)
    {
        char ch;
        String wd="";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                ans=wd+" "+ans ;
                wd="";
            }
            else
            {
                wd=wd+ch;
            }
        }
        return ans;
    }
    public static void main()throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" enter the array limit");
        int size=Integer.parseInt(br.readLine());
        String arr[]=new String[size];
        String arr2[]=new String[size];
        String s="";
        encryption ep=new encryption();
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter sentence");
            s=br.readLine();
            s=s.toUpperCase()+" ";
            arr[i]=s;
        }
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            arr2[i]=ep.change(arr[i]);
            else
             arr2[i]=ep.change2(arr[i]);
            }
            for(int i=0;i<size;i++)
            {
                System.out.println(arr2[i]);
            }
        }
    }
        
    
        
        
            