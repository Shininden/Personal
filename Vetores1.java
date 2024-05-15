import java.util.Scanner;

public class Vetores1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[7];
        int evenNumbers = 0;

        for (int i = 0; i < vetor.length; i++) 
        {
            System.out.println("Type the " + i + " value");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) 
        {
            if(vetor[i] % 2 == 0)
            {
                evenNumbers++;
                System.out.println("There's an even number in the " + i + " position");
            }
        }
        System.out.println("The total of even number is: " + evenNumbers);

        sc.close();
    }
}
