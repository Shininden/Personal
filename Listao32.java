public class Listao32
{
    public static void main(String[] args) 
    {
        //Fazer um programa que calcula a soma dos primeiros 50 números pares a partir de 2.
        int somaPar = 0;
        int totalOfEven = 0;

        int somaImpar = 0;
        int totalOfOdds = 0;

        int somaMde3 = 0;
        int totalOfMultiplos = 0;

        for (int i = 2; totalOfEven < 50; i += 2, totalOfEven++) 
        {
            somaPar += i;

                if(totalOfEven != 49)
                    System.out.print(i + " + ");
                else
                    System.out.print(i + " = " );
        }
        System.out.println(somaPar);

        System.out.println();

       //Fazer um programa que calcula a soma dos primeiros 50 números ímpares a partir de 1. 
        for (int j = 1; totalOfOdds < 50; j += 2, totalOfOdds++) 
        {
            somaImpar += j;

            if(totalOfOdds != 49)
                System.out.print(j + " + ");
            else
                System.out.print(j + " = " );
        }
        System.out.println(somaImpar);

        System.out.println();

        // Fazer um programa que mostra os primeiros 50 números múltiplos de 3 iniciando de 0.
        for (int k = 0; totalOfMultiplos < 50; k += 3, totalOfMultiplos++) 
        {
            somaMde3 += k;

            if(totalOfMultiplos != 49)
                System.out.print(k + " + ");
            else
                System.out.print(k + " = " );
        }
        System.out.println(somaMde3);
    }
}