package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again. (Yes, this violates the
 * Single Responsibility Principle, but for this lab, we'll overlook that.)
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 { 

    // this method responsible for output
    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        try{
            
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        String lastName = app.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());   
        }
    }

    // write the code to extract the lastName from the fullName
    // Use exception handling to prevent a crash in the event that fullName
    // is null or empty. Throw the exception to the calling method. and handle
    // it there.
    public String extractLastName(String fullName) throws IllegalArgumentException {
        //this only takes into account someone having one first name
        String lastName = null;
        int spaceDelimiter = -1;
        
        for (int allCharsInFullName = 0; allCharsInFullName < fullName.length(); allCharsInFullName++) {
            if (fullName.charAt(allCharsInFullName) == ' ') {
                spaceDelimiter = allCharsInFullName;
                break;
            }
        }
        if (spaceDelimiter != -1) {
            StringBuilder extractedLastName = new StringBuilder();
            for (int allCharsInLastName = spaceDelimiter +1; allCharsInLastName < fullName.length(); allCharsInLastName++) {
                extractedLastName.append(fullName.charAt(allCharsInLastName));
            }
            lastName = extractedLastName.toString();
        }
        if (lastName == null || lastName.length() == 0) {
            throw new IllegalArgumentException("Please enter a first and last name");
        }

        // Your code goes here.
        return lastName;
    
    
    
}
}
    
