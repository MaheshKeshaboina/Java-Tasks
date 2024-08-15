import java.util.*;
import java.io.*;
public class Binary {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask = 1<<pos;
        int number = bitMask | n;
        System.out.println(number);

        
        
    }
}
