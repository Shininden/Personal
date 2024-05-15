import java.util.Arrays;
import java.util.Scanner;

public class SortingVetors 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Integer vet[] = new Integer[4];
        

        for (int i = 0; i < vet.length; i++) 
        {
            System.out.print("Type a value ");
            vet[i] = sc.nextInt();
        }

        //Using method
        Arrays.sort(vet);
        for (Integer value : vet)
        {
            System.out.print("{" + value + "}" + " ");
        }

        //Na unha
        /*int aux = 0;
        for (int i = 0; i < 3; i++) 
        {
            for (int j = i + 1; j < vet.length; j++) 
            {
                if(vet[i] > vet[j])
                {
                    aux = vet[i];  
                    vet[i] = vet[j]; 
                    vet[j] = aux;  
                }
            }
        }

        for (int i = 0; i < vet.length; i++) 
        {
            System.out.print("{" + vet[i] + "}" + " ");
        }*/

        

        sc.close();
    }
}
