/*import java.util.*;
interface Animal{
    void show();
}
class Dog implements Animal{
    @Override
    public void show(){
        System.out.println("Dog");
    }
}
class Main{
    public static void main(String[] args){
        Dog d = new Dog();
        d.show();
    }
}*/
/*
@FunctionalInterface
interface Animal{
    void show();
}
class Dog implements Animal{
    @Override
    public void show(){
        System.out.println("DOg");
    }
}
public class Main{
    public static void main(String[] args){
        Animal a = new Dog();
        a.show();
    }
}*/
@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}
public class Main{
    public static void main(String[] args){
        /*Calculator cal = (a,b) -> {
            return a + b;
        };*/
        Calculator cal = (a,b) -> a + b;
        int answer = cal.calculate(5,3);
        System.out.println("addition is " + answer);
    }
}