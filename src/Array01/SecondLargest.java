package Array01;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2){
            System.out.println(-1);
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            if (arr[i] > large) {
                secLarge = large;
                large = arr[i];
            }
            else if (arr[i] > secLarge && arr[i] != large){
                secLarge = arr[i];
            }
        }

        if (secLarge == Integer.MIN_VALUE){
            System.out.println(-1);
        } else {
            System.out.println(secLarge);
        }
    }
}
