import java.util.Scanner;

public class Bhaskara 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double delta = (b*b) - (4 * a * c);
        
        if(a == 0 || delta < 0)
            System.out.println("Impossivel calcular");

        else
        {
            System.out.println("R1 = " + String.format("%.5f", (-b + Math.sqrt(delta)) / (2*a) ) );
            System.out.println("R2 = " + String.format("%.5f", (-b - Math.sqrt(delta)) / (2*a) ) );
        }
        
        sc.close();

    }
}

/*import java.util.Scanner;

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
}*/