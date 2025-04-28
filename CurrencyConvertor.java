import java.util.*;
public class CurrencyConvertor {
    public static void main(String[] args)
    {
        Map<String,Double> rates=new HashMap<>();
        rates.put("USD",1.0);
        rates.put("EUR",0.92);
        rates.put("INR",83.3);
        Scanner sc=new Scanner(System.in);
        System.out.print("Base currency(USD/EUR/INR):");
        String from= sc.next().toUpperCase();
        System.out.print("Target currency(USD/EUR/INR):");
        String to =sc.next().toUpperCase();
        
         if(!rates.containsKey(from)||!rates.containsKey(to))
         {
            System.out.println("Invalid currency code entered");
            return;
         }
        System.out.print("Amount:");
        double amount = sc.nextDouble();
        double converted=amount/rates.get(from)*rates.get(to);
        System.out.printf("Converted amount:%.2f %s\n",converted,to);
    }
    
}
