//Suppose a student must be at least 18 years old and have a valid ID card to enter an exam hall.
import java.util.Scanner;

public class five{
    public static void main(String [] args) {
        //int age = 28;
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("the age is " + age);
        //boolean hasId = true ; 
        boolean hasId  = input.nextBoolean();
        System.out.println("HASID is " + hasId);
        if(age >= 18) {
            if(hasId == true) {
                System.out.println("valid to enter");
            } else {
                System.out.println("not allowed to enter");
            }
        } else {
            System.out.println("minor as age is " + age);
        }

    }
}