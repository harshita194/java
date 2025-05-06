import java.util.*;

public class treasureBoxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        int c = scanner.nextInt(); 

        int middle;
        if ((a > b && a < c) || (a < b && a > c)) {
            middle = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            middle = b;
        } else {
            middle = c;
        }

        int min = Math.min(a, Math.min(b, c));

        System.out.println("The treasure is in the box which has the number " + middle);
        System.out.println("The code to open the box is " + min);
    }
}
