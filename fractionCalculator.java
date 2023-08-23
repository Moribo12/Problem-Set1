import java.text.DecimalFormat;
import java.util.*;

public class fractionCalculator {
    static int d;
    static int n1,n2,d1,d2;
    static char operator;

    private static double getSumOfAddition(){
       double sum= 0;

       Scanner s =new Scanner(System.in);
        System.out.println("Enter n1:");
        n1 =s.nextInt();
        System.out.println("Enter n2:");
         n2=s.nextInt();
        System.out.println("Enter operator:");
        operator =s.next().charAt(0);
        System.out.println("Enter d1:");
         d1 =s.nextInt();
        System.out.println("Enter d2:");
         d2 =s.nextInt();

        if(operator =='+' && d1==d2){
            double add =n1 +n2;
            d=d1;
            double total =add/d;
            sum += total;
        }else{
            double cross = d1 *n2;
            double cross1= d2 * n1;
            d = d1 *d2;
            double total = (cross+cross1)/d;
            sum += total;
        }
        
         DecimalFormat df =new DecimalFormat();
        System.out.println(n1 +" "+ n2 +"\n"+ "_"+" " + operator+ "_" +" " + "="+ " " +df.format(sum)+ "\n" + d1 +" "+ d2);

        return sum;

    }

     private static double getSumOfSubtraction(){
       double sum2= 0;

         Scanner s =new Scanner(System.in);
        System.out.println("Enter n1:");
        n1 =s.nextInt();
        System.out.println("Enter n2:");
         n2=s.nextInt();
        System.out.println("Enter operator:");
        operator =s.next().charAt(0);
        System.out.println("Enter d1:");
         d1 =s.nextInt();
        System.out.println("Enter d2:");
         d2 =s.nextInt();

        if(operator =='-' && d1==d2){
            double add =n1 -n2;
            d=d1;
            double total =add/d;
            sum2 += total;
        }else{
            double cross = d1 *n2;
            double cross1= d2 * n1;
            d = d1 *d2;
            double total = (cross-cross1)/d;
            sum2 += total;
        }
        
        DecimalFormat df =new DecimalFormat();
        System.out.println(n1 +" "+ n2 +"\n"+ "_"+" " + operator+ "_" +" " + "="+ " " +df.format(Math.abs(sum2))+ "\n" + d1 +" "+ d2);

        return sum2;
    }

    private static void getSumOfMultiplicaton(){
      int sum1 =0;
      int top =0;
      int buttom =0;

        Scanner s =new Scanner(System.in);
        System.out.println("Enter n1:");
        n1 =s.nextInt();
        System.out.println("Enter n2:");
         n2=s.nextInt();
        System.out.println("Enter operator:");
        operator =s.next().charAt(0);
        System.out.println("Enter d1:");
         d1 =s.nextInt();
        System.out.println("Enter d2:");
         d2 =s.nextInt();
       
        if(operator=='*'){

         top =n1*n2;
         buttom =d1*d2;
        //int total1 =top/buttom;
        //sum1 += total1;

        DecimalFormat df =new DecimalFormat();
        //System.out.println(n1 +" "+ n2 +"\n"+ "_"+" " + operator+ "_" +" " + "="+ " " +df.format(sum1)+ "\n" + d1 +" "+ d2);
          System.out.println("top"+ top+" "+ operator+"buttom"+ buttom);
        }else{
            System.out.println("An error as occurred");
        }

        //return sum1;
    }


    public static void main(String[] args) {

      
       //getSumOfAddition(); 
       //getSumOfSubtraction();
       getSumOfMultiplicaton();

    }
    
}
