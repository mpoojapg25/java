import java.util.Scanner;
public class Evenoddscan{
     public static void main(String args[]){
         Scanner n = new Scanner(System.in);
         System.out.println("enter the number:");
         int a = n.nextInt();
         if (a%2==0)
         System.out.println("even");
         else
         System.out.println("odd");
     }
}