public class Task13 {
    public static void main(String[] args) {
        for(int num = 1; num<=1000; num++){
            int original = num;
            int sum=0;
            int digits = String.valueOf(num).length();

            int temp = num;
            while (temp>0) {
                 int digit = temp % 10;  
            sum += Math.pow(digit,digits);
            temp /= 10; 
            }
            if (sum==original){
                System.out.println(original);
            }
        }
    }
    
}
