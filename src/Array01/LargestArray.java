package Array01;

import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0){
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int large = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > large)
                large = arr[i];
        }
        System.out.println(large);
    }
}
