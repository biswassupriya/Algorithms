import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        while(b != 0){
            int t = a%b  ;
            System.out.println(a = t);
           System.out.println(a = b);
            System.out.println(b = t%b);
            System.out.println(a);
        }
    }
}
