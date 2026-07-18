/*import java.util.Scanner;
 
public class input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int sum = input1 + input2 ; 
        System.out.println("the sum is " + sum);
        
    }
}*/
import java.util.Scanner;

public class input{
       static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println();
        int b = sc.nextInt();
        System.out.println();
        swap(a,b);
    }
}