class compare2
{
    int arr[]={1,2,3,4,5,6,7,8,9,10};
int recursion(int l,int u, int n)
    {
        int mid=(l+u)/2;
        if(arr[mid]==n)
        return mid;
        else if(l>u)
        return -1;
        else if(arr[mid]>n)
        return(recursion(l,mid-1,n));
        else if(arr[mid]<n)
        return(recursion(mid+1,u,n));
        else
        return-1;
    }
    int normal(int n)
    {
        int mid=0,l=0,u=10,count=0;
        while(u>=l)
        {
            mid=(l+u)/2;
            if(arr[mid]==n)
            {
                count++;
                break;
            }
            else if(arr[mid]>n)
            u=mid-1;
            else
            l=mid+1;
        }
        if(count==1)
        return mid;
        else
        return -1;
    }
    public static void main()
    {
        int n=5;
        compare2 cp=new compare2();
        long start1=System.currentTimeMillis();
        cp.normal(n);
        long stop1=System.currentTimeMillis();
        System.out.println(" Time taken by the normal function of binary search is equal to " + (stop1-start1));
        long start2=System.currentTimeMillis();
        cp.recursion(0,10,n);
        long stop2=System.currentTimeMillis();
        System.out.println(" Time taken by the recursive function of binary search is equal to " + (stop2-start2));
    }
}
         