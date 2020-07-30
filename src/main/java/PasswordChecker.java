import java.util.Scanner;
//The  PasswordChecker class compiles methods
// which checks if the password entered is valid, if the password is ok and if password is never ok.
public class PasswordChecker {

       static boolean passwordExist = true;
       static boolean passwordCharLength = true;
       static boolean passwordLowerCase = true;
       static boolean passwordUpperCase = true;
       static boolean passwordOneDigit = true;
       static boolean passwordOneSpecialChar = true;


    public static void main(String[] args) {
        //Password instructions
        System.out.println("Please note that your password: " +
                "\n " + "1. Shouldn't be empty." +
                "\n 2. Must be longer than 8 characters." +
                "\n 3. Must contain at least one UPPERCASE & lowercase letter." +
                "\n 4. Should have At least one digit." +
                "\n 5. Should have  A special character.");

        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password");

        String userPassword = input.nextLine();


        try {
            if (userPassword.isEmpty()) {
                System.out.println("password is never ok ");
            }
            else {
                System.out.println(passwordIsValid(userPassword));
                System.out.println(passwordIsOk(userPassword));
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // The method passwordIsValid checks if password is empty,
    // if is less than 8 characters, if it matches Uppercase
    // and lowercase letters,if password matches at least one digit and
    // at least one special character. If not then each conditional
    // statement returns a string treated like an error message.
    // passwordIsValid method returns the parameter of type String 'password'.
    public static String passwordIsValid(String password) {


        if (password.isEmpty()){
                passwordExist = false;
                return ("password should exist");
        }


        if (password.length() < 8){
                 passwordCharLength = false;
                return("password should be longer than 8 characters");
        }


        if (!password.matches((".*[A-Z].*"))){
                 passwordUpperCase = true;
                 return ("password should have at least one uppercase letter");
        }


        if (!password.matches((".*[a-z].*"))){
                passwordLowerCase = false;
                 return "password should have at least one lowercase letter";
        }


        if (!password.matches((".*[\\d].*"))){
                 passwordOneDigit = false;
                 return ("password should have at least one digit");
        }


        if (!password.matches((".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*"))){
                passwordOneSpecialChar = false;
                return ("password should have at least one special character");
        }

        //passwordIsValid returns type String 'password'.
        return "Password is valid!";
    }


    public static  boolean passwordIsOk(String password){

        boolean passwordIsOkChecker;


            if(password.length() >= 8 || password.matches(".*[A-Z].*") ||
                    password.matches(".*[a-z].*") ||
                    password.matches(".*[\\d].*") ||
                    password.matches(".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*")){
                passwordIsOkChecker = true;
                System.out.println("Password is ok!");
            }
            else{
                passwordIsOkChecker = false;
                System.out.println("password is not ok!");
            }
        return passwordIsOkChecker;
    }




    }
