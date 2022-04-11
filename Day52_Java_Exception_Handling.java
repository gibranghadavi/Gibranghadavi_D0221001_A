/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gibranghadavi;
import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public static int power(int n, int p) throws Exception{
    if(n < 0 || p < 0){
        throw new Exception ("n or p should not be negative.");
    }else if(n==0 && p ==0){
        throw new Exception("n and p should not be zero.");
    }

     else {
        return ((int)Math.pow(n,p));
    }
}

    
}
public class Day52_Java_Exception_Handling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

