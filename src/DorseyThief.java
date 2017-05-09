import java.util.Scanner;

/**
 Mr. Dorsey Dawson recently stole X grams of gold from ACME Jewellers. He is now on a train back home. To avoid getting caught by the police, he has to convert all the gold he has into paper money.
 He turns into a salesman and starts selling the gold in the train.

 There are N passengers who have shown interest in buying the gold. The ith passenger agrees to buy ai grams of gold by paying  dollars.
 Dawson wants to escape from the police and also maximize the profit. Can you help him maximize the profit?

 Note: The ith passenger would buy exactly ai grams if the transaction is successful.

 Input Format

 The first line contains two space separated integers, N and X, where N is the number of passengers who agreed to buy and X is the stolen amount of gold (in grams).
 N lines follow. Each line contains two space separated integers - vi and ai, where vi is the the value which the passenger has agreed to pay in exchange for ai grams of gold.

 Constraints

 1<=X<=5000
 1<=N<=1000000

 all vi's and ai's are less than or equal to 1000000 and greater than 0.
 Output Format

 If it's possible for Dorsey to escape, print the maximum profit he can enjoy, otherwise print Got caught!.
 */
public class DorseyThief {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;
        int X;

        int[] vi; //value of gold
        int[] ai; //grams of gold

        N = input.nextInt();
        X = input.nextInt();

        input.nextLine();

        vi = new int[N];
        ai = new int[N];

        for(int i = 0 ; i<N; i++){
            vi[i] = input.nextInt();
            ai[i] = input.nextInt();
            input.nextLine();
        }



    }

}
