import java.util.*;
class AddTwoNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        // int carry = 0;
        // int maxLength = Math.max(n,m);
        // int c[] = new int[maxLength+1];
        // int k = maxLength;
        // for(int i=0; i<n; i++){
        //     for(int j=0)
        //     int digit_a = a[i];
        //     int digit_b = b[i];
        //     int sum = digit_a + digit_b + carry;
        //     c[k] = sum%10;
        //     carry = sum/10;
        // }
        // int i = n - 1;
        // int j = m - 1;
        // int k = maxLength;

        // while(i >= 0 || j >= 0 || carry > 0) {
        //     int digit_a = (i >= 0) ? a[i] : 0;
        //     int digit_b = (j >= 0) ? b[j] : 0;

        //     int sum = digit_a + digit_b + carry;
        //     c[k] = sum % 10;
        //     carry = sum / 10;

        //     i--;
        //     j--;
        //     k--;
        // }

        // // Print the result
        // int start = (c[0] == 0) ? 1 : 0;
        // for(int x = start; x <= maxLength; x++) {
        //     System.out.print(c[x] + " ");
        // }
        

        // Normalize lengths
        int maxLength = Math.max(n, m);
        int[] A = new int[maxLength];
        int[] B = new int[maxLength];
        System.arraycopy(a, 0, A, maxLength - n, n);
        System.arraycopy(b, 0, B, maxLength - m, m);

        // First pass: sum without carry
        int[] result = new int[maxLength + 1];
        for (int i = 0; i < maxLength; i++) {
            result[i + 1] = A[i] + B[i];
        }

        // Second pass: handle carry from right to left
        for (int i = maxLength; i > 0; i--) {
            if (result[i] >= 10) {
                result[i] %= 10;
                result[i - 1] += 1;
            }
        }

        // Print result (skip leading 0 if unnecessary)
        for (int i = (result[0] == 0 ? 1 : 0); i <= maxLength; i++) {
            System.out.print(result[i] + " ");
        }

    }
}