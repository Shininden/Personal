import java.util.Scanner;

public class TabelaPartidas 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String vet[] = new String[3];

        for (int i = 0; i < vet.length; i++) 
        {
            System.out.print(i + " Team's name: ");
            vet[i] = sc.nextLine();
        }

        
        for (int i = 0; i < 2; i++) 
        {
            for (int j = i + 1; j < vet.length; j++) 
            {
                if(vet[i] != vet[j])
                {
                    System.out.println(vet[i] + " X " + vet[j]);
                }
            }
        }

        sc.close();
    }
}
