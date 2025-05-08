import java.util.*;
class strong_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }

        if (sum == original) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong number");
        }
    }

    // Method to calculate factorial of a digit
    static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}