package lab2;

import javax.swing.JOptionPane;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
//this only takes into account someone having one first name
        String lastName = null;
        int spaceDelimiter = -1;
        try {
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
    } catch(IllegalArgumentException iae) {
       throw new IllegalArgumentException("Please enter a first and last name");
    }
    }
    

    
    
}
