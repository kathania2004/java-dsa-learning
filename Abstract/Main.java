abstract class Animal{
    int age = 5;
    static void eat(){
        System.out.println("eating");
    }
    abstract void sound();
}
class Dog extends Animal{s
    @Override
    void sound(){
        System.out.println("dog");
    }

}
public class Main{
    public static void main(String[] args){
        Dog a = new Dog();
        a.sound();
        eat();
        System.out.println(a.age);
    }
}