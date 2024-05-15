import java.util.Scanner;

public class CorrectingTests 
{


    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        char[] answerKey = new char[5];
        String[] studentsNames = new String[3];
        double[] grades = new double[3];
    
        char givenAnswers;
        double finalGrade = 0;
        

        //Registering AnswerKey
        System.out.println("Registrate the Answer Key: ");

        for(int i = 0; i < answerKey.length; i++)
        {
            System.out.println("Question " + (i+1) + ":");
            answerKey[i] = sc.nextLine().charAt(0);
        }


        //Getting Students Inputs
        for(int i = 0; i<3;i++)
        {
            System.out.println("Student's names: ");
            studentsNames[i] = sc.nextLine();

            System.out.println("Given answers:");

            for(int j = 0; j < 5; j++)
            {
                System.out.print((j+1) + " - ");

                givenAnswers = sc.nextLine().charAt(0);

                if(givenAnswers == answerKey[j])
                    grades[i]++;
            }
        }

        //Calculating Grades
        for(int k = 0; k < grades.length; k++)
            finalGrade += grades[k];

        finalGrade /= 3;


        //Displaying Results
        for(int i = 0; i < studentsNames.length; i++)
            System.out.println("Student " + studentsNames[i] + " grade: " + grades[i]);


        System.out.printf("Class Average: %.2f", (finalGrade));

        sc.close();
    }
}