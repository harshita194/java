import java.util.*;
class secondMaxiElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int largest = a[0];
        int secondLargest = 0;
        for(int i=0; i<n; i++){
            if(a[i] > largest){
                secondLargest = largest;
                largest = a[i];
            }
            else if(a[i] < largest && a[i] > secondLargest){
                secondLargest = a[i];
            }
        }
        System.out.println(secondLargest);

    }
}