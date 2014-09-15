import java.util.Scanner;


public class Assignment1_2{
    public static void main(String[ ] args){
         System.out.println("Enter number of disks");
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();

         System.out.println("The move are:");
         moveDISKs(n, 'A', 'B', 'C');
     } 
     public static void moveDISKs(int n, char fromTower, char toTower, char auxTower){
       if ( n==1)
           System.out.println("move disk" + n + " from " + fromTower + " to " + toTower);
       else {
           moveDISKs(n-1, fromTower, auxTower, toTower);
           System.out.println("Move disk" + n + " from " + fromTower + " to " + toTower);
           moveDISKs(n-1, auxTower, toTower, fromTower);
       }
       
    }
}
