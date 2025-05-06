import java.util.*;

public class checkDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), s = sc.nextInt();
        int row = (s - 1) / c, col = (s - 1) % c;
        System.out.println((row == 0 || col == 0 || col == c - 1) ? "CSE" : "ECE");
    }
}
