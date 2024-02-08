class recursion
{
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        if(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
           reverseArray(arr,start+1,end-1);
           
            
        }
    }
    static void print(int arr[],int i)
    {
        if(i>arr.length-1)return;
        else
        {
        System.out.println(arr[i]);
        print(arr,i+1);
        }
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8};
        reverseArray(arr,0,arr.length-1);
        print(arr,0);
        
        
    }
}