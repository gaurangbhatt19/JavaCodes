
class LargestNumber {
public static void main(String[] args) {
   int [] al= {5,20,12,20,10};
   int max=al[0];
   for(int i=1;i<al.length;i++) 
   {
     if(al[i]>max){
        max=al[i];
     }
   }
   System.out.println(max);
}
}
