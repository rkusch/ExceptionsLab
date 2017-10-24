package lab2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui extends JFrame {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        lastName = nameService.extractLastName(fullName);
  
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
    }
    public void displayException(Exception iae) {
         JOptionPane.showMessageDialog(this,
            iae.getMessage(),
            "Data Entry Error",
            JOptionPane.ERROR_MESSAGE );
    }
     
}
