class hackathon
{
    public static void main()
    {
        String s="HoenlDM_lei_";
        int n=s.length();
        if(n%5==0)
        {
            n=s.length()/5;
        }
        else
        {
            n=s.length()/5 +1;
        }
        String arr[][]=new String[n][5];
        System.out.println("\f");
        int i=0,r=0,c=0,j=0;
        int a[]={0,1,2,3};
        for(i=0;i<4;i++)
        {
            c=a[i];
            for(r=0;r<n;r++)
            {
                arr[r][c]=""+s.charAt(j);
                j++;
            }
        }
        for(r=0;r<n;r++)
        {
            for(c=0;c<4;c++)
            {
                if(arr[r][c].compareTo("_")!=0)
                System.out.print(arr[r][c]);
            }
        }
    }
}