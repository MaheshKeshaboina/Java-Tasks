
public class Clearbit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask = 1<<pos;
        int notbitMask= ~(bitMask);

        int number = notbitMask & n;
        System.out.println(number);
    }
    
    
}
