import java.util.*;

class Conditions2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();

        if (a==b)
        {
            System.out.print("a is equal to b");
        }
        else if (a>b)
        {
            System.out.print("a is greater than b");
        }
        else
        {
            System.out.print("a is less than b");
        }
    }
}
