import java.util.*;
class Kaprekar_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int square = n*n;
        int sum =0;
        int count =0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        int r = (int)Math.pow(10,count);
        int left = square/r;
        int right = square % r;
        sum = left + right;
        if(n == sum){
            System.out.println("Kaprekar number");
        }
        else{
            System.out.println("Not Kaprekar number");
        }
    }
}