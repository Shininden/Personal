package Basic.Repetition;
import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = 0, somador = 1;

        System.out.print("How long do you want the Fibonacci sequence to be?" + " ");
        int length = sc.nextInt();

        for (int i = 0; i < length; i++) 
        {
            System.out.print(number + " ");
            somador += number; 
            number = somador - number; 
        }  
        sc.close();
    }
}