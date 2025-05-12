public class Task14 {
    public static void main(String[] args) {
         for (int num = 1; num <= 100; num++) {
            if (isPalindrome(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }
}
