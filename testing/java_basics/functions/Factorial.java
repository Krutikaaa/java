import java.util.*;

public class Factorial {

    public static void Factorial(int n){
        if (n<0){
            System.out.println("Invalid Number");
            return;
        }
        else if(n == 0|| n==1){
            System.out.println("1");
            return;
        }
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Factorial(n);

    }
}