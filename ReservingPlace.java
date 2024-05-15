import java.util.Scanner;
import java.util.Vector;

public class ReservingPlace 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Vector<String> places = new Vector<>(); 
        Boolean ocuppiedPlaces[] = new Boolean[10];

        int chosenPlace = 0;
        char answer = ' ';
        
        for (int i = 0; i < ocuppiedPlaces.length; i++) 
            ocuppiedPlaces[i] = false;

        for (int i = 0; i < 10; i++) 
            places.add(i, "(" + "B " + i + ")");

        System.out.println((places));

        do 
        {   
            System.out.print("Which place would you like to get? B");
            chosenPlace = sc.nextInt();

            if(ocuppiedPlaces[chosenPlace] == false)
            {
                places.set(chosenPlace, "(---)");
                ocuppiedPlaces[chosenPlace] = true;
            }
            else
                System.out.println("Error, this place is already occupied!");
            

            System.out.print("Do you want to make another reservation? [Y/N] ");
            answer = sc.next().charAt(0);

            System.out.println();

            System.out.println((places));

        } while (answer != 'N');

        sc.close();
    }
}