import java.util.*;
class nearest_divisible_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();

        int a = m * (num/m);
        int b = a + m;

        if((num - a)<(b-num)){
            System.out.println(a);
        }
        else if((num - a)==(b-num)){
            System.out.println(b);
        }
        else{
            System.out.println(b);
        }
    }
}