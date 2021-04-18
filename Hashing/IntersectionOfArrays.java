import java.util.*;
public class IntersectionOfArrays{
 static int intersect(int a[],int b[])
 {
     int res=0;
     Set<Integer> s=new HashSet<Integer>();
     for(int i: a)
     {
         s.add(i);
     }
     for(int j:b)
     {
         if(s.contains(j))
         {
             res++;
             s.remove(j);
         }
     }
     return res;
 }
 public static void main(String[] args)
 {
     int a[]={1,2,3,4,7};
     int b[]={1,2,5,6,7,8};
     System.out.println(intersect(a,b));


 }
}