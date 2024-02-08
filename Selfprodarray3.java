import java.util.*;

class Selfprodarray3
{
public static void main(String[] args)

{       
    int i=0,pro=1;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter array size");
	  int n=sc.nextInt();
	ArrayList<Integer> arr=new ArrayList<>(n);
  
    System.out.println("enter list of array");
    for(i=0;i<n;i++)
	{
        arr.add(i,sc.nextInt());
	}  
    System.out.println("self product array");
	
       
	   for(i=0;i<n;i++)
	{	
        pro*=arr.get(i);
    }
    for(i=0;i<n;i++)
    {
		System.out.println(pro/arr.get(i));
		
	}



}

}