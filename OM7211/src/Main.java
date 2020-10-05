import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        count(new Scanner(System.in).nextInt());
    }
    static void count(int p){
        int amount;
        int amountOffOdd = 0;
        System.out.println(p*(p-1)/2);

        for(int i = 1; i<p; i++){
            amount=0;
            for(int j=1; j<p; j++){
                amount+=(Math.pow(i,j))%p;

            }
            if(amount==p*(p-1)/2){
                amountOffOdd++;
            }
            System.out.println(i + ": " + amount);

        }
        System.out.println(amountOffOdd);

    }
}
