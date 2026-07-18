import java.util.Scanner;

public class temperature {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        float temp = input.nextFloat();
        System.out.println("temperature in celsius is " + temp);

        // converting celsius to farenheit

        double farenheit = ((9f / 5) * temp) + 32 ; 
        System.out.println(farenheit);
    }
}