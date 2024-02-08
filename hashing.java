import java.util.*;
class hashing
{
    public static void main(String args[])
    {
        int n=5;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[n];
        int hash[]=new int[10];
        Arrays.fill(hash,0);

        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(hash[i]);
        }
        


    }
}