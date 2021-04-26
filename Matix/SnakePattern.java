public class SnakePattern{
    public static void main(String[] args)
   {
       int [][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       for(int i=0;i<arr.length;i++){

              if(i%2==0){
                  for(int k=0;k<arr[i].length;k++)
                  System.out.print(arr[i][k]+",");
              }

              else{
                  for(int l=arr[i].length-1;l>0;l--)
                  System.out.print(arr[i][l]+",");
              }
                 
           
       }
   } 
}