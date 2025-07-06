import java.util.*;

public class Addition {

    public static int Addition(int a, int b){
        int addition = a + b ;
        System.out.println(addition);
        return addition;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Addition(a, b);
    }
}