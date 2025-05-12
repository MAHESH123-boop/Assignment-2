public class Task9 {
    public static void main(String[] args) {
        int num = 121;
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
    }
}
