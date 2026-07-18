import java.util.Scanner;
public class nine{
    static int sum(){
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    System.out.println("num1 is " + num1);
    int num2 = input.nextInt();
    System.out.println("num2 is: " + num2);
    int sum = num1 + num2;
    return sum;
    }
    
    public static void main(String [] args){
        //sum();
        System.out.println("the sum of num1 and num2 is " + sum());

    }
}

