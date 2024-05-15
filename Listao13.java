import javax.swing.JOptionPane;

public class Listao13 
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Type another one"));

        if(n > 0 && n1 > 0)
            JOptionPane.showMessageDialog(null, Math.pow(n, n1));
        else
            JOptionPane.showMessageDialog(null, "Please type a valid number");
    }
}