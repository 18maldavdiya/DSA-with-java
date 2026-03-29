import java.util.*;

public class Decimal_to_Binary {
    public static int decimalToBinary(int n){
        int binary =0;
        int pow = 0;
        while(n>0){
            int lastNum = n%2;
            binary = binary + (lastNum * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        return binary;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int binary = decimalToBinary(n);
        System.out.println(binary);
    }
}
