package Array01;

import java.util.Scanner;

public class MeanOfArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0){
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }

        double avg =  (double) sum / n;
        System.out.println(avg);

    }
}
