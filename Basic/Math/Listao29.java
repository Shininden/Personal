package Basic.Math;
import java.util.Scanner;

public class Listao29
{
    
    static Scanner sc = new Scanner(System.in);

    static int n = 0;
    static int divisores = 0;
    
    
    public static void main(String[] args) 
    {
        System.out.println("csfs");
        System.out.print("Provide me a number ");
        n = sc.nextInt();

        int soma = 0;

        if(n % 2 == 0)
            numberOfDivisores();

        else
        {
            for (int i = 1; i < n; i++) 
            {
                soma += i;
                
                if(i != n - 1)
                    System.out.print(i + " + ");
                else
                    System.out.print(i + " = " );
            }
            System.out.println(soma);
        }

        sc.close();
     
    }

    static void numberOfDivisores()
    {
        for (int i = 1; i <= n ; i++) 
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
                divisores++;     
            } 
        }
        System.out.println();
        System.out.println(n + " Has " + divisores + " divisores ");
    }
}