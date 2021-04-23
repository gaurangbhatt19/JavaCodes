import java.util.*;
public class SubArraywithGivenSum{
    static boolean SubArrayWithSum(int []arr,int sum)
    {
        int prefix_sum=0;
        Set<Integer> hs=new HashSet<Integer>();
        for(int i:arr){
            prefix_sum+=i;
            if(sum==prefix_sum)
            {
                return true;
            }
            if(hs.contains(prefix_sum-sum))
            {
                return true;
            }
            hs.add(prefix_sum);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int [] arr={2,3,4,6};
        System.out.println(SubArrayWithSum(arr,7));
    }
}