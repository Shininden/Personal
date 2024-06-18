package Basic.Math;
import javax.swing.JOptionPane;

public class Listao20 
{
    public static void main(String[] args) 
    {
        double salario_Base = Double.parseDouble(JOptionPane.showInputDialog("What's the wage?"));
        double tax = salario_Base * 7 / 100;
        double bonifiedWage = salario_Base * 1.05;

        double actualWage = bonifiedWage - tax;

        JOptionPane.showMessageDialog(null, actualWage);
    }
}