import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class PasswordCheckerTest{

    @Test
    public void passwordIsValidTest(){
        assertEquals(true,PasswordChecker.passwordIsValid(""));

    } @Test
    public void passwordIsOkTest(){
        assertEquals(false,PasswordChecker.passwordIsOk());

    }


}












































//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//public class PasswordCheckerTest {
//
//    static ArrayList<Integer> elements = new ArrayList<>();
//    public static boolean passwordIsValid(String password)
//    {
//
//        boolean status = false;
//
//        if(password.isEmpty()){
//            System.out.println("Password should not be empty!");
//            elements.add(1);
//        }
//        if(password.length()<8){
//            System.out.println("password should be at least be 8 characters long");
//            elements.add(1);
//        }
//        if(!password.matches(".*[A-Z].*")){
//            System.out.println("password should have at least one uppercase letter");
//            elements.add(1);
//
//        }
//        if(!password.matches(".*[a-z].*")){
//            System.out.println("password should have at least one lowercase letter");
//            elements.add(1);
//        }
//        if(!password.matches(".*[0-9].*")){
//            System.out.println("password should have at least one digit");
//            elements.add(1);
//        }
//        if(!password.matches("(.*[~!@#$%^&*()_+]).*")){
//            System.out.println("password should have at least one Special character");
//            elements.add(1);
//        }
//        if(!password.isEmpty() && password.length()>8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*[0-9].*") && password.matches("(.*[~!@#$%^&*()_+]).*")){
//            status = true;
//        }
//
//        return status;
//
//    }
//
//    @Test
//    public void passwordIsValidTest() {
//
//        Assert.assertEquals(passwordIsValid(""), passwordIsValid("Sindi*555"));
//    }
//
//    public  static  boolean passwordIsOk()
//    {
//
//        boolean status = false;
//        try {
//            if(elements.size() > 0 && elements.size()< 4) {
//                status = true;
//            }
//
//        }catch (Exception e){
//            status = false;
//        }
//
//        return status;
//
//    }
//
//
//    @Test
//    public void passwordIsOkTest() {
//
//        Assert.assertEquals(passwordIsOk(), passwordIsOk());
//    }
//}
