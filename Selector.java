import javax.swing.JOptionPane;

public class Selector 
{
    public static void main(String[] args) 
    {
        String answer = " ";
        int brunnete18Male = 0;
        int blondOnnesan = 0;
        do 
        {
            String gender = JOptionPane.showInputDialog("What's the gender? [M/F]");   
            String hairColor = JOptionPane.showInputDialog("What's the hair color? \nBlack\nBrunnete\nBlond\nAuburn");    
            int age = Integer.parseInt(JOptionPane.showInputDialog("What's the age"));

            if(gender.equalsIgnoreCase("m") && hairColor.equalsIgnoreCase("Brunnete") && age >= 18)
                brunnete18Male++;
            else if(gender.equalsIgnoreCase("f") && hairColor.equalsIgnoreCase("Blond") && age >= 25 && age <= 30)
                blondOnnesan++;

            answer = JOptionPane.showInputDialog("Would you like to continue? [Y/N]");
        } 
        while (answer.equalsIgnoreCase("Y"));
        
        JOptionPane.showMessageDialog(null, "There are " + brunnete18Male + " brunnete 18 Males \nThere are " + blondOnnesan + " blond Oneesans");
    }
}
