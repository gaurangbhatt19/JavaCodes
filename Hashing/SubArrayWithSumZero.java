import java.util.*;
public class SubArrayWithSumZero{
    static boolean subarraySumZero(int[] arr)
    {
     HashSet<Integer> hs=new HashSet<Integer>();
     int prefixSum=0;
     for(int i:arr)
     {
         System.out.println(i);
         prefixSum=prefixSum+i;
         if(hs.contains(prefixSum))
         {
             System.out.println(prefixSum);
             System.out.println(hs);
             return true;
        }
        if(prefixSum==0)
       {
          return true; 
       }
       hs.add(prefixSum);
       System.out.println(hs);
     }
    return false;
   
}
public static void main(String[] arg)
{
    int arr[]={3,4,3,-1,1};
    System.out.println(subarraySumZero(arr));

}
}