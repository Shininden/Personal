package Basic.Math;
import javax.swing.JOptionPane;

public class Listao17 
{
    public static void main(String[] args) 
    {
        int weight_In_KG = Integer.parseInt(JOptionPane.showInputDialog("kg? "));
        int number_Of_Cats = Integer.parseInt(JOptionPane.showInputDialog("How many cats? "));
        int weight_In_G = Integer.parseInt(JOptionPane.showInputDialog("how much each cat eats in grams every day? "));

        int dailyConsumption = number_Of_Cats * weight_In_G;

        JOptionPane.showMessageDialog(null, "The food will last for " + weight_In_KG * 1000 / dailyConsumption + " days");
    }
}