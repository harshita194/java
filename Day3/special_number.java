import java.util.*;
class special_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int last , first, prod, sum, ans;
        for(int i=n; i<=m; i++){
            last = i%10;
            first = i/10;
            sum = last + first;
            prod = last * first;
            ans = sum + prod;
            if(ans == i){
                System.out.println(i);
            }
        }
    }
}