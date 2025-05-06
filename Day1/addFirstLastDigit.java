import java.util.Scanner;

public class addFirstLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int lastDigit = number % 10;

        int firstDigit = number;
        firstDigit /= 1000;

        int sum = firstDigit + lastDigit;
        System.out.println(sum);
    }
}
