import javax.swing.JOptionPane;

public class Listao12 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Type a positive number"));

        JOptionPane.showMessageDialog(null, Math.pow(n, 2));
        JOptionPane.showMessageDialog(null, Math.pow(n, 3));
        JOptionPane.showMessageDialog(null, Math.sqrt(n));
    }
}
