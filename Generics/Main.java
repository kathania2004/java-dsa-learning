class Box<T>{
    T value;

    Box(T value){
        this.value = value;
    }

    T display(){
        return value;
    }
}
class Printer{
    public <T> void print(T value){
        System.out.println(value);
    }
}
public class Main{
    public static void main(String[] args){
        Box<Integer> b = new Box<>(14);
        Printer p = new Printer();
        p.print(15);
        Box<String> s = new Box<>("Himanshu");
        System.out.println(b.display());
        System.out.println(s.display());

    }
}