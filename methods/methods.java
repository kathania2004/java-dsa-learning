//Create a method isEven(int n) that returns true if the number is even.
/*import java.util.Scanner;

public class methods{
    static boolean isEven(int n){
       return n % 2 == 0;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("n:" + n);
        System.out.println(isEven(n));
      //  System.out.println(isEven())

    }
}*/
//Create a method cube(int n) that returns the cube of a number.
/*import java.util.Scanner;

public class methods{
    static int cube(int n ){
        return n*n*n;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("n:" + n);
        //int c = cube(n);
        System.out.println("the cube of " + cube(n));
    }
}*/
//Create a method reverseNumber(int n) that returns the reversed number.
/*import java.util.Scanner;

public class methods{
    static int reverseNum(int n){
        int rev  = 0;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        return rev;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("n : " + n);
        int revNum = reverseNum(n);
        System.out.println("the reverse num is " + revNum);

    }
}*/
//Create a method add(int a, int b) and another method that uses it to find the average of two number
/*import java.util.Scanner;

public class methods{
    static int sum(int a, int b){
        return a+b;
    }
    static int avg(int s, int n){
        int average = s/n;
        return average;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        int s = sum(a,b);
        System.out.println("the number of terms for the average:" + n);
        System.out.println("the average is " + avg(s,n));


    }
}*/
//Create a method isPositive(int n) and use it inside another method to check whether a number is positive and even.

/*import java.util.Scanner;

public class methods{
    static boolean isPositive(int n){
        return n>=0;
    }
    static boolean ancMethod(int n){
        if( isPositive(n) && n%2==0 ){
            System.out.println("the number is positive and even");
        }else{
            System.out.println("the number is not positive and even");
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPositive(n));
        System.out.println(ancMethod(n));
    }
}*/

import java.util.Scanner;

public class methods{
    static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the factorial of number " + n);
        System.out.println("the factorial is " + factorial(n));
        
        
    }
}