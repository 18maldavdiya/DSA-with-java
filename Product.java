import java.util.*;

public class Product {
    public static int Mul(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = Mul(a,b);
        System.out.println("product of " + a +" and " + b + " is " + product);
    }
    
}
