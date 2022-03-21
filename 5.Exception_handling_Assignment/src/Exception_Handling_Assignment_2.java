import java.util.*;
public class Exception_Handling_Assignment_2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a password.");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        try {
            validatePassword(password);
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    static void validatePassword(String password) throws PasswordException {
        if (password.length() < 5 || password.length()>10) {
            throw new PasswordException("Password length is less than 10");
        }
        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean digitCheck = false;
        boolean specialCharacterCheck=false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
            {
                upperCheck = true;
            }
            if (Character.isLowerCase(c))
            {
                lowerCheck = true;
            }
            if (Character.isDigit(c)) {
                digitCheck = true;
            }
            if((password.contains("@")||(password.contains("#")||(password.contains("$")))))
            {
                specialCharacterCheck=true;
            }
        }
        if (!upperCheck) {
            throw new PasswordException("There must be an uppercase character");
        }
        if (!lowerCheck) {
            throw new PasswordException ("There must be a lowercase character");
        }
        if (!digitCheck) {
            throw new PasswordException ("There must a be a digit");
        }
        if(specialCharacterCheck==false)
        {
            throw new PasswordException("Special character missing");
        }
        System.out.println("Valid password.");
    }
    static class PasswordException extends Exception {
        public PasswordException() {
            super("Invalid password");
        }
        public PasswordException(String message) {
            super("Invalid password: " + message);
        }
    }
}


