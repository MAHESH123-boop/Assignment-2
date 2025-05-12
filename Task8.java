public class Task8 {
    public static void main(String[] args) {
        int num = 1234; 
            int reversedNumber = 0;
    
            do {
                int lastDigit = num % 10; 
                reversedNumber = reversedNumber * 10 + lastDigit; 
                num /= 10; 
            } while (num > 0);
    
            System.out.println("Reversed num: " + reversedNumber); 
        }
    }

