import java.util.*;
class subsequence
{
    static void fun(int ind,ArrayList v,int arr[],int n)
    {
        if(ind==n)
        {
            
            System.out.println(v);          
            return;
        }
        v.add(arr[ind]);
        sum+=arr[ind];
        fun(ind+1,v,arr,n);
        sum-=arr[ind];
        v.remove(v.size()-1); 
        fun(ind+1,v,arr,n);
       


    }
    public static void main(String args[])
    {
        int n=3;
        ArrayList<Integer> v=new ArrayList<Integer>();
        int arr[]={1,2,1};
        fun(0,v,arr,n);


    }
}
