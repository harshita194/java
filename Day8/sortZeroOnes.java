import java.util.*;

class sortZeroOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // Number of binary inputs
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();    // Read each binary number as integer
        }

        for (int i = 0; i < n; i++) {
            int m = a[i];
            int countZ = 0;
            int countO = 0;

            // Count 0s and 1s in the current binary number
            while (m != 0) {
                int digit = m % 10;
                if (digit == 0) {
                    countZ++;
                } else {
                    countO++;
                }
                m /= 10;
            }

            // Print sorted binary for current number
            for (int j = 0; j < countO; j++) {
                System.out.print("1");
            }
            for (int j = 0; j < countZ; j++) {
                System.out.print("0");
            }
            System.out.println();  // Move to next line
        }
    }
}
