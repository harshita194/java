import java.util.*;
class Armstrong_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        
        while(temp!=0){
            temp /= 10;
            count++;
        }
        
        int sum = 0;
        temp = n;
        while(temp!=0){
            int digit=temp%10;
            sum += (int)Math.pow(digit,count);
            temp/=10;
        }
        
        if(n == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number"); 
        }
    }
}