public class GCD {
   static int gcdMod(int a,int b)
   {
       if(b==0)
       return a;
       return gcdMod(b,a%b);
   }
   static int gcdArithmetic(int a, int b){
       while(a!=b){
           if(a>b){
               a=a-b;
           }
           if(b>a)
           {
               b=b-a;
           }
       }
       return a;
   }
    public static void main(String[] args)
    {
        int a=24;int b=12;
           System.out.println(gcdMod(a,b));
           System.out.println(gcdArithmetic(a,b));
    }
    
}
