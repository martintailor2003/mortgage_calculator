import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        String var0 = "Martgage calculator";
        System.out.println(var0);


        Scanner input = new Scanner(System.in);
        try{

            System.out.print("Loan ammount: ");
            float amount = input.nextFloat();
            System.out.print("Interest rate(): ");
            float interest_rate = input.nextFloat();
            System.out.print("Payback period(years): ");    
            int payback = input.nextInt();

            var monthly_interest_rate = ((interest_rate / 100 )/ 12);
            var payback_months = payback * 12;

            //M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]. 
            //Math.pow((1 + monthly_interest_rate), payback_months); (1 + monthly_interest_raate)^payback_months 

            var monthly_mortgage = amount * (monthly_interest_rate*(Math.pow((1 + monthly_interest_rate), payback_months))) / (Math.pow((1 + monthly_interest_rate), payback_months) - 1);
            //var monthly_mortgage = amount * [monthly_interest_rate*(1 + monthly_interest_rate)^payback_months ] / [ (1 + monthly_interest_rate)^payback_months – 1];

            
            //var monthly_mortgage = amount * [monthly_interest_rate(1 + monthly_interest_rate)^payback_months ] / [ (1 + monthly_interest_rate)^payback_months – 1];





            System.out.println(monthly_mortgage);

        }finally {
            input.close();
        }


    }

}