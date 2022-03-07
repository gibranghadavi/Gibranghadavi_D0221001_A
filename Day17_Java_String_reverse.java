
package gibranghadavi;
import java.io.*;
import java.util.*;

public class Day17_Java_String_reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        for (int i = 0; i <s.length(); i++) {
            System.out.print(s.substring(s.length()-1-i, s.length()-1-i+1));
        
        }
        System.out.println();
            
        }
    
    }

