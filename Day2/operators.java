import java.util.*;
public class operators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of coins: ");
        int Total = sc.nextInt();
        System.out.println("Enter the percentage of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the percentage of y: ");
        int y = sc.nextInt();

        int longBen = ((Total * x)/100);
        int rem = Total - longBen;
        int blackbeard = ((rem * y)/100);
        int next_rem = rem - blackbeard;
        int remaining = next_rem/3;

        System.out.println(longBen);
        System.out.println(blackbeard); 
        System.out.println(remaining); 

    }   
}