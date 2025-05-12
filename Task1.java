import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Num:");
        int num =scn.nextInt(); 

        if  (num % 2 == 0) {
            System.out.println (num + " is even.");
        } else {
            System.out.println (num + " is odd.");
        }

        scn.close();
    }
}