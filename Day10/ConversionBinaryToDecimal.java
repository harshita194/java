import java.util.*;
class ConversionBinaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  decimal = 0;
        int i = 0;
        while (n != 0) {
            int rem = n % 10;
            decimal = decimal + rem *(int)Math.pow(2,i);
            i++;
            n /= 10;
        }

        System.out.println(decimal);
    }
}