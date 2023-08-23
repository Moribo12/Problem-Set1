import java.text.NumberFormat;
import java.util.*;

public class morgateCalc {
    final float ANNUAL_RATE = 0.0392f;

    public static void main(String[] args) {

        double morgateAmount = 0;
        double rate = (0.0392 / 12) + 1;
        double monthly_rate = 0.0392/ 12;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double amount = s.nextDouble();

        System.out.println("Enter number of years:");
        int years = s.nextInt();

        int period = years * 12;

        double numenator = monthly_rate * (Math.pow(1 + monthly_rate, period));
        double denumentor = Math.pow(1 + monthly_rate, period) - 1;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        morgateAmount = amount * (numenator / denumentor);
        System.out.println(currency.format(morgateAmount));


        s.close();

    }
}
