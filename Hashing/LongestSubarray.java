import java.util.*;
public class LongestSubarray{
    static int LongestSubarrayWithGivenSum(int []arr,int sum)
    {
        int res=0,prefix_sum=0;
        Map<Integer,Integer> m= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefix_sum=prefix_sum+arr[i];
            if(prefix_sum==sum){
                res =i+1;
            }
            if(m.containsKey(prefix_sum)==false){
                m.put(prefix_sum,i);
            }
            if(m.containsKey(prefix_sum-sum)){
              res=Math.max(res,i-m.get(prefix_sum-sum));
            }
        }
        return res;
    }
    public static void main(String[] arg)
    {
        int[] arr={8,3,1,5,-6,6,2,2};
        int sum=4;
        System.out.println(LongestSubarrayWithGivenSum(arr,sum));
       
    }
}