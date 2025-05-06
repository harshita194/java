// reverse digits in 3-digit number

import java.util.*;
public class reverse_digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = n % 10;
        int middle = ((n/10) % 10);
        int first = n/100;
        int ans = last*100 + middle*10 + first*1;
        System.out.println(ans);
    } 

}       