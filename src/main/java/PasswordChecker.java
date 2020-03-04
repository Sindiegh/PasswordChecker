import java.util.ArrayList;
import java.util.Scanner;

public class PasswordChecker {

    static ArrayList<Integer> elements = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("(Note: Password must at least be 8 characters long, have an Uppercase,Lowercase, \n at least 1 digit and a special character");
        System.out.println("Please enter a password :  ");
        Scanner userInput = new Scanner(System.in);
        String password = userInput.nextLine();

        boolean status = passwordIsValid(password);
        if(passwordIsOk()){
            System.out.println("Password is ok");
        }
        if(status){
            System.out.println("Passsword Approved!");
        }

    }


    public static boolean passwordIsValid(String password)
    {

        boolean status = false;

        if(password.isEmpty()){
            System.out.println("Password should not be empty!");
            elements.add(1);

        }
         if(password.length()<8){
            System.out.println("password should be at least be 8 characters long");
            elements.add(1);

        }
         if(!password.matches(".*[A-Z].*")){
            System.out.println("password should have at least one uppercase letter");
            elements.add(1);

        }
        if(!password.matches(".*[a-z].*")){
            System.out.println("password should have at least one lowercase letter");
            elements.add(1);
        }
         if(!password.matches(".*[0-9].*")){
            System.out.println("password should have at least one digit");
            elements.add(1);
        }
         if(!password.matches("(.*[-~!@#$%^&*(){}_\"\"+]).*")){
            System.out.println("password should have at least one Special character");
            elements.add(1);
        }
        if(!password.isEmpty() && password.length()>8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[0-9].*") &&
                password.matches("(.*[-~!@#$%^&*()_+]).*")){
            status = true;
        }

        return status;

    }

    public  static  boolean passwordIsOk()
    {

        boolean status = false;
        try {
           if(elements.size() > 0 && elements.size()< 4) {
               status = true;
           }

        }catch (Exception e){
            status = false;
        }

        return status;

    }



}
