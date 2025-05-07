import java.util.*;
class digitOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1 ; i <= n; i++){
            int num = i;
            int digit_count = 0;
            while(num!=0){
                num = num/10;
                digit_count++;
            }
            if(digit_count % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}