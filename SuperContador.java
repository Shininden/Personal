import java.util.Scanner;

public class SuperContador
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press '1' to count from 1 to 10, '2' to count from 10 to 1 or '3' to exit ");
        int inputNumber = sc.nextInt();


        switch (inputNumber) 
        {
            case 1:
                for (int i = 0; i <= 10; i++) 
                    System.out.print(i + " ");
            break;

            case 2:
                for (int i = 10; i >= 0; i--) 
                    System.out.print(i + " ");
            break;

            case 3:
                System.out.print("Exiting");
            break;

            default:
                System.out.println("That's an invalid number");
                break;
        }
           
        sc.close();
    }
}
