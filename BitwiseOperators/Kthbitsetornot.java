import java.util.Scanner;

public class Kthbitsetornot {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n=120;
        int k=2;
        if((n & (1<<(k-1)))!=0){
            System.out.print(true);
        }else{
            System.out.println(false);
        }

        if((n>>(k-1) & 1) == 1)
        {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
