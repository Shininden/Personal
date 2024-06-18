package Basic.Repetition;
import javax.swing.JOptionPane;

public class ExerRepet
{
    public static void main(String[] args) 
    {
        int number = 0,
            total_Value = 0, total_of_Numbers = 0,
            even_Numbers = 0, odd_Numbers = 0,
            higher_than_100 = 0,
            average = 0;

            String answer;
        
        do 
        {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Provide a number" ));
            total_of_Numbers++;

            total_Value += number;

            answer = JOptionPane.showInputDialog(null, "Would you like to continue? [Y/N]");

            if(number % 2 == 0)
                even_Numbers++;
            else
                odd_Numbers++;

            if(number > 100)
                higher_than_100++;
        }
        while(answer.equalsIgnoreCase("Y"));

        average = total_Value / total_of_Numbers ;

        JOptionPane.showMessageDialog(null, "Total of numbers: " + total_of_Numbers + 
                                                            "\n Total of even numbers: " + even_Numbers + 
                                                            "\n Total of odd number: " + odd_Numbers +
                                                    "\n Total of numbers higher than 100: " + higher_than_100 +
                                                           "\n The avrage is:" + average);
    }
}
