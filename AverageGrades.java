import java.util.Scanner;

public class AverageGrades 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String names[] = new String[4];
        double grades1[] = new double[4];
        double grades2[] = new double[4];
        double averages[] = new double[4];

        double summedAverages = 0, class_Average_Grade = 0;
        int goodStudens = 0;

        for (int i = 0; i < 4; i++) 
        {
            System.out.println("Student: " + i);

            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.println();  
            

            System.out.print("First grade: ");
            grades1[i] = sc.nextDouble();
            System.out.println(); 

            System.out.print("Second grade: ");
            grades2[i] = sc.nextDouble();
            System.out.println();

            sc.nextLine();

            averages[i] = (grades1[i] + grades2[i]) / 2;
            summedAverages += averages[i];

        }

        class_Average_Grade = (summedAverages / 4);
        
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(names[i]);
            System.out.println(averages[i]);

            if(averages[i] > class_Average_Grade)
                goodStudens++;
        }

        System.out.println("There are " + goodStudens + " students above the average of " + class_Average_Grade);
        
        sc.close();
    }
}