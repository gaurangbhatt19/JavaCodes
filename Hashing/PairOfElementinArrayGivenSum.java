import java.util.*;
public class PairOfElementinArrayGivenSum {
static boolean pairPresent(int[] a,int sum)
{
    Set<Integer> s= new HashSet<Integer>();
    for(int i:a){
        if(s.contains(sum-i))
        {
            return true;
        }
        else{
            s.add(i);
        }
    }
    return false;
}
public static void main(String[] args)
{
  int []a={1,2,3,4,5};
  int sum=11;
  System.out.println(pairPresent(a,sum));
}    
}
