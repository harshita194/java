import java.util.*;
class hotel_tariff_calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int room_rent = sc.nextInt();
        int daysStayed = sc.nextInt();
        if(month < 1 || month > 12){
            System.out.println("Invalid");
        }
        else{
            int amount = room_rent * daysStayed;
            System.out.println(amount);
        }
    }
}