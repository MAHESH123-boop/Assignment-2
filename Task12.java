import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = scn.nextInt();
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;  
            sum += Math.pow(digit,3);
            num /= 10;  
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scn.close();
    }
    
}
