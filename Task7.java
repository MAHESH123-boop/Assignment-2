import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter num:");
        int num = scn.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num*i);
        }

        scn.close();
    }
    
}
