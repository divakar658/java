import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        int ans[]=new int[k];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        int count=0;
        for(Map.Entry<Integer,Integer>entry:list)
        {
            if(count!=k)
            {
                ans[count]=entry.getKey();
                count++;
            }
        }
        return ans;
    }
}