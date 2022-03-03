
package gibranghadavi;
import java.util.*;
import java.text.*;

public class Day13java_Currency_Formatter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat fUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fIndi = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat fCina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String US = fUS.format (payment);
        String india = fIndi.format (payment);
        String china = fCina.format (payment);
        String france = fFrance.format (payment);
        
        
        System.out.println("US: " + US);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
}
