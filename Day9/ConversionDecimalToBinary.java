import java.util.*;
class ConversionDecimalToBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
            return;
        }
        int  binary = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % 2;
            binary += rem * place;
            place *= 10;
            n /= 2;
        }

        System.out.println(binary);
    }
}