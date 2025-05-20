import java.util.*;
class setbit2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        int ans = num|(1 << i);
        System.out.println(ans);
    }
}