// * * * *
//   * * *
//     * *
//       *

import java.util.*;
class pattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
   }
}