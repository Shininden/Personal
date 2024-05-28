import java.util.Scanner;

public class Bhaskara 
{
    static int a = 0, b = 0, c = 0;

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        
        
        System.out.print("Type the value of 'a' ");
        a = sc.nextInt();

        System.out.print("Type the value of 'b' ");
        b = sc.nextInt();
        
        System.out.print("Type the value of 'c' ");
        c = sc.nextInt();

        double x1 = (-b + Math.sqrt(delta(b, a, c))) / 2*a;
        double x2 = (-b - Math.sqrt(delta(b, a, c))) / 2*a;

        System.out.println("x1 = " + x1 + "\nx2 = " + x2);

        sc.close();

    }

    static double delta(double b, double a, double c)
    {
        double bsqr = Math.pow(b, 2);

        if((bsqr - (4 * a * c)) < 0)
            System.out.println("This calculation is impossible, because delta is negative");
        
        return bsqr - (4 * a * c);
    }
}