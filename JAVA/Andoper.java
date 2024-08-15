
import java.util.*;
import java.io.*;
public class Andoper {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask = 1<<pos;
        if((bitMask & n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
        
        //int number = bitMask & n;
        //System.out.println(number);

        
        
    }
}

