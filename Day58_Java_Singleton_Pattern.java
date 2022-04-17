
package gibranghadavi;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class Day58_Java_Singleton_Pattern {
    public static void main(String[] args) {
    private Singleton() {}
    public String str;
    private static Singleton singleton;
    static Singleton getSingleInstance() {
        if (singleton == null)
            singleton = new Singleton();
        
        return singleton;
    }
 }

