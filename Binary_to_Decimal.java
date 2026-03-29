import java.util.*;

public class Binary_to_Decimal {
    public static int binarytoDecimal(int n){
        int decimal =0;
        int pow = 0;
        while(n>0){
            int lastNum = n%10;
            decimal = decimal + (lastNum * (int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int decimal = binarytoDecimal(n);
        System.out.println(decimal);

    }
    
}
