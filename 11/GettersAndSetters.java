class Student{
   private String name;
    private int age;

   public String getName(){
        return name;
    }

     public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int n){
        this.age = n;
    }
}
public class GettersAndSetters{
    public static void main(String[] args){
        Student s = new Student();
        s.setAge(18);
        s.getAge();
        s.setName("Himanshu");
        s.getName();
        System.out.println(s.getAge());
        System.out.println(s.getName());

    }
}