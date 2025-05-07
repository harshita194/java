import java.util.*;
class evensum_oddsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        int oddsum = 0;
        int evensum = 0;
        int count =0;
        while(n!=0){
            digit = n % 10;
            if(digit % 2 != 0){
                oddsum += digit;
            }
            else{
                evensum += digit;
            }
            n = n/10;
            count++;
        }
        System.out.println(oddsum);
        System.out.println(evensum);
        System.out.println(count);
    }
}