import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int number=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i!=j){
                    System.out.print(j+"");
                }else{
                System.out.print("*"); 
                }
            }
           System.out.println();
                
        }
        
    }
}