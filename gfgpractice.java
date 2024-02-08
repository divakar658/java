import java.io.*;
class gfgpractice
{
    static void leftrotate(int arr[],int d)
    {
        if(d==0)
        {
            return;
        }
        int n=arr.length;
        reversal(arr,0,d-1);
        reversal(arr,d,n-1);
        reversal(arr,0,n-1);
       


    }
    static void reversal(int arr[],int start,int end)
    {
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void print_arry(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int d=2;
        int n = arr.length;
        leftrotate(arr,d);
        print_arry(arr);
        
    }
}