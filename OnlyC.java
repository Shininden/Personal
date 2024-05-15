import javax.swing.JOptionPane;

public class OnlyC 
{
    public static void main(String[] args) 
    {
        String name = " ";
        char firstLetter = ' ';
        String onlyCs[] = new String[6];
        int tot_Of_Cnames = 0;

        for (int i = 0; i < onlyCs.length; i++) 
        {
            name = JOptionPane.showInputDialog("Type a name");
            firstLetter = name.charAt(0);

            if(firstLetter == 'C')
            {
                tot_Of_Cnames++;
                onlyCs[i] = name;
            }
        }

        for (int j = 0; j < tot_Of_Cnames; j++) 
        {
            
            JOptionPane.showMessageDialog(null, onlyCs[j]);
        }
    }
}