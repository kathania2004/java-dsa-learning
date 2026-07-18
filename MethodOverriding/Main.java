// HERE WHAT HAPPENED IS FIRST AT COMPILE TIME IT IS CHECKED THAT REFERENCE IS CONTAINING METHOD OR NOT IF 
// YES THEN IT IS EXECUTED AND AT RUNTIME JVM CHECKS THE ACTUAL OBJECT THAT WHICH VERSION OF METHOD IT IS CONTAINING
class Animal{
    void sound(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Barks");
    }
}
public class Main{
    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();

    }
}