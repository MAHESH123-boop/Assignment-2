public class Task11 {
    public static void main(String[] args) {
        int num = 153, original = num,  sum = 0;
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
    }
    
}
