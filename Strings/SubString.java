
public class SubString {
   static boolean isSubString(String s1,String s2)
   {
       int j=0;
       for(int i=0;i<s1.length()&&j<s2.length();i++){
           if(s1.charAt(i)==s2.charAt(j)){
               j++;
           }

       }
       return j==s2.length();

   }

    public static void main(String[] args){
    String s1="GEEKFORGEEKS";
    String s2="GRGES";
    System.out.println(isSubString(s1,s2));

   }
}
