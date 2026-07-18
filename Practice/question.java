import java.util.Scanner;
// to check number is positive or negative
/*public class question {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("number:" + n);

        if(n>=0){
            System.out.print("number is positive");
        }else {
            System.out.println("number is negative");
        }
    }
}*/

/*public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    System.out.println("number: " + n);

    if(n%2==0) {
        System.out.println("the number is even" + n);
    }else {
        System.out.println("the number is odd which is " + n);
    }
}*/

//TO CHECK WHETHER THE NUMBER IS DIVISIBLE BY 5 OR NOT

/*public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    System.out.println("the number given: " + n);

    if(n % 5 == 0){
        System.out.println("the number is divisible by 5 and the number is " + n);
    }else {
        System.out.println("the number is not divisible by 5");
    }
}*/

// TO CHECK WHETHER THE YEAR IS LEAP YEAR OR NOT
/*public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int days = input.nextInt();
    System.out.println("Days:" + days);

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    System.out.println("Days:" + n);

    if(days == 366) {
        System.out.println("Leap Year");
    }else - if(days == 365) {
        System.out.println("Not a leap year");
    }else{
        System.out.println("not a leap");
    }
}*/

// To check whether a character is upercase or lower or digit 
/*
public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    char character = input.next().charAt(0);
    System.out.println(character);
    //char character = 'A';
    int val = (int)(character);
    System.out.println(val);

    if(val >= 65 && val <= 90) {
        System.out.println("the character is in uppercase");
    }else if(val >= 97 && val <= 122) {
        System.out.println("the character is in lowercase");
    }else if(val >= 48 && val <= 57) {
        System.out.println("the character is digit");
    }else {
        System.out.println("some other character");
    }
}*/

//calculator program
/*public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int i = input.nextInt();
    int j = input.nextInt();
    char n = input.next().charAt(0);
    System.out.println("i:" + i);
    System.out.println("j:" + j);

    switch(n) {
        case '+':
            System.out.println("i+j : " + (i + j));
            break;
        case '-':
            System.out.println(i - j); 
            break;

    }

}*/

/*public static void main(String [] args) {
    for(int i=1; i<=5; i++){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}*/

/*public static void main(String [] args) {
    for(int i=1; i<=5; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}*/
/*public static void main(String [] args) {
    for(int i=5; i>=1; i--){
        for(int j=5; j>=i; j--){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
*/
/*public static void main(String [] args){
    for(int i=0;i<5;i++){
        //space
        for(int j=0;j<(5-i-1);j++){
            System.out.print(" ");
        }
        //star
        for(int j=0;j<(2*i+1);j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<5-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}*/
/*public static void main(String [] args){
    for(int i=0;i<5;i++){
        for(int j=0;j<i;j++){
            //space
            System.out.print(" ");
        }
        //star
        for(int j=0;j<2*5-2*i+1;j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}*/
/*public static void main(String [] args){
    for(int i=0;i<=5;i++){
        for(int j=0;j<5-i+1;j++){
            System.out.print(" ");
        }
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        for(int j=0;j<5-i+1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}*/
public static void main(String [] args){
    for(int i=1;i<=5;i++){
        //stars
        for(int j=1;j<i;j++){
            System.out.print("*");
        }
        //space
        for(int j=1;j<5-i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=0;i<=5;i++){
        for(int j=0;j<5-i;j++){
            System.out.print("*");
        }
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}


