import java.util.Scanner;

/**
 Colleen is turning n years old! She has n candles of various heights on her cake, and candle i has height .

 Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.

 Given the height for each individual candle, find and print the number of candles she can successfully blow out.
 */
public class BirthdayCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }

        int maxHeight = 0;
        int countMaxHeightCandles = 0;

        for(int h : height){

            if(h>maxHeight){
                maxHeight = h;
                countMaxHeightCandles = 1;
            } else if(h == maxHeight){
                countMaxHeightCandles += 1;
            }

        }

        System.out.println(countMaxHeightCandles);
    }

}
