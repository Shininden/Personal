import java.util.Scanner;

public class List3_33 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type number 1: ");
        int i = sc.nextInt();

        System.out.print("Type number 2: ");
        int j = sc.nextInt();

        System.out.print("Type total of multipliers: ");
        int n = sc.nextInt();

        int cont = 0;

        for (int x = 0; cont < n; x++) 
        {
            if(x % i == 0)
            {
                System.out.print(x + " ");
                cont++;
            }
                
            else if(x % j == 0)
            {
                System.out.print(x + " ");
                cont++;
            } 
                    
        }

        sc.close();
    }
}