import java.util.*;
public class LongestSubArrayWith01{
    public static int longestSubSrray01(int []arr)
    {
        int res=0;
        Map<Integer,Integer> m= new HashMap<>();
        int prefix_sum=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr[i]=-1;
            }
        }
        System.out.println(arr);

        for(int i=0;i<arr.length;i++)
        {
            prefix_sum+=arr[i];

            if(prefix_sum==0){
              res+=i;
            }
            if(m.containsKey(prefix_sum)==false)
            {
                m.put(prefix_sum,i);
            }
            if(m.containsKey(prefix_sum))
            {
                res=Math.max(res,i-m.get(prefix_sum));
            }
        }
        return res;
    }
public static void main(String[] args)
{
   int []arr={1,0,1};
   System.out.println(longestSubSrray01(arr));
}
}