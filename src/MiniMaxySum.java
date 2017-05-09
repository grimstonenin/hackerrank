import java.util.Scanner;

/**
 Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */
public class MiniMaxySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        long minSum = 0;
        long maxSum = 0;
        long sum = 0;

        for(int i = 0; i<5; i++){
            sum = 0;
            for(int j = 0; j<5; j++){
                if(j!=i){
                     sum += arr[j];
                }
            }

            if(minSum==0){
                minSum = sum;
            } else if(minSum>sum){
                minSum = sum;
            }

            if(sum>maxSum){
                maxSum = sum;
            }
        }

        System.out.println(minSum + " " + maxSum);

    }


}
