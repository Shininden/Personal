import java.util.Scanner;

public class List2_32 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");

        System.out.println();

        System.out.println("Especificação    Código   Preço");
        System.out.println("Cachorro Quente   100     1.20");
        System.out.println("Bauru Simples     101     1.30");
        System.out.println("Bauru com Ovo     102     1.50");
        System.out.println("Hamburguer        103     1.20");
        System.out.println("Cheeseburguer     104     1.70");
        System.out.println("Suco              105     2.20");
        System.out.println("Refrigerante      106     1.00");

        System.out.print("Type the code of your product: ");
        int code = sc.nextInt();

        System.out.print("How many units do you want? ");
        int amount = sc.nextInt();
        double value = 0;

        switch (code) 
        {
            case 100:
                value = amount * 1.20;
                break;

            case 101:
                value = amount * 1.30;
                break;

            case 102:
                value = amount * 1.50;
                break;
                
            case 103:
                value = amount * 1.20;
                break;

            case 104:
                value = amount * 1.70;
                break;

            case 105:
                value = amount * 2.20;
                break;

            case 106:
                value = amount * 1.00;
                break;

            default:
                System.out.println("Invalid code");
                break;
        }

        System.out.printf("The total amount to be paid is: %.2f", value);

        sc.close();
    }
}