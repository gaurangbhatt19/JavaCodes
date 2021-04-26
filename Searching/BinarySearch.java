public class BinarySearch {
    public static void main(String[] args){
       int [] arr={10,20,30,40,50};
       int number =20;
       int min=0;int max=arr.length-1;
       
      while(min<=max)
      {
          int mid=(min+max)/2;
         // System.out.println(mid);
          if(arr[mid]==number){
              System.out.println(mid);
              break;
          }
          else if(arr[mid]>number){
              max=mid-1;
            }
         else{
                min=mid+1;
           }
    }
    
}
}
