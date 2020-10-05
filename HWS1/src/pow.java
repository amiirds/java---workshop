import java.util.Scanner;
import java.lang.Math;
public class pow {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter second integer");
        b = sc.nextInt();
        System.out.println(Math.pow(a, b));

    }
}