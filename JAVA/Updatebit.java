
import java.util.*;
import java.io.*;
public class Updatebit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int oper =sc.nextInt();

        int n=5;
        int pos=1;
        int bitMask = 1<<pos;
        if(oper==1){
            int newnumber =bitMask | n;
            System.out.println(newnumber);
        }else{
            int newbitMask = ~(bitMask);
            int newnumber =newbitMask & n;
            System.out.println(newnumber);
        }
        
        
        
    }
}
