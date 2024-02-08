import java.util.*;
public class sol
{
     void  find_combinationsum(int ind,int target,list<list<Integer>>ans,list<Integer>ds)
    {
        
        if(target==0)
        {
            ans.add(ds);
            return;
        }
        for(int i=ind;i<arr.length();i++)
        {
            if(i>ind && arr[i]==arr[i-1])
            {
                continue;
            }
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }


    }

    public static list<list><Integer>find_combination(int target,int arr[])
    {
        Arrays.sort(arr);
        findCombinations(0,arr, target, ans, new ArrayList < > ());
        return ans;
    }
    public static void main(String args[])
    {
        int v[]={10,1,2,7,6,1,5};
        List < List < Integer >> comb = combinationSum2(8,v);
        System.out.println(comb.toString().replace(",", " "));
    }
}