import javax.swing.JOptionPane;

public class Listao28 
{
    public static void main(String[] args) 
    {
        double number1 = 0, number2 = 0;
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick one of these options\n 1: Sum two numbers \n 2: A number's square root"));

        if(option == 1)
        {
            number1 = Double.parseDouble(JOptionPane.showInputDialog("type the first number"));
            number2 = Double.parseDouble(JOptionPane.showInputDialog("type the second number"));
            JOptionPane.showMessageDialog(null, "Sum = " + (number1 + number2));
        }
        else
        {
            number1 = Double.parseDouble(JOptionPane.showInputDialog("type the number"));
            JOptionPane.showMessageDialog(null, Math.pow(number1, 2));
        }
    }
}