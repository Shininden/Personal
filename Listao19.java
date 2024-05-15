import javax.swing.JOptionPane;

public class Listao19 
{
    public static void main(String[] args) 
    {
        double n = Double.parseDouble(JOptionPane.showInputDialog("type value"));

        JOptionPane.showMessageDialog(null, n * 0.9);
    }
}