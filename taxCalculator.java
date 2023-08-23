import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        final double TAX =0.15;

        Scanner s= new Scanner(System.in);

        System.out.print("Enter the item name:");     
        String itemName =s.next();
        System.out.print("Enter the cost of the item:");  
        double cost =s.nextDouble();

        double taxAmount = TAX * cost;
        double purchase = cost + taxAmount;

        System.out.println("Item:" +itemName+ "\n" +"Tax:" +taxAmount+"\n" +"Cost:" +cost+"\n" +"Total Purchase:" +purchase+"\n" );
       

        
    }
}
