import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Eneter a Number:");
        int num = scn.nextInt();
        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0) {
                int lastDigit = num % 10; 
                reversedNumber = reversedNumber * 10 + lastDigit; 
                num /= 10; 
            } 

            if (originalNumber == reversedNumber){
                System.out.println(originalNumber + "is a palindrome");
            }else{
                System.out.println(originalNumber + "is not a palindrome");

    }
    scn.close();
}
}