public class triangle
{
    int i,j,z,count;
    void triangle_count(int arr[])
    {
        for(i=0;i<arr.length;i++)
        {
            for(j=1;j<arr.length-1;j++)
            {
                for(z=2;z<arr.length-2;z++)
                {
                    if(arr[i]+arr[j]>arr[z]||arr[i]+arr[z]>arr[j])
                    {
                        count+=1;
                    }
                }
            }
        }
    }
}
public class tester
{
    public static void main(String args[])
    {
        int arr[]={4,6,3,7};
        triangle obj=new triangle();
        obj.triangle_count(arr);
        System.out.println("no.of triangles"+obj.count);
    }
}
