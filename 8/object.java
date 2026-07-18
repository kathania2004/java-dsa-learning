import java.util.Scanner;
class One{
    String name;
    int age;

    void sum(int n1, int n2){
        System.out.println(name + " " + age);
        int sum = n1 + n2;
        System.out.println("sum: " + sum);
    }
    
}
public class Object{
    public static void main(String [] args) {
        int a = 10;
        int b = 20;
        One s1  = new One();
        s1.name = "Himanshu";
        s1.age = 22;
        s1.sum(10,20);
        
        

    }
}