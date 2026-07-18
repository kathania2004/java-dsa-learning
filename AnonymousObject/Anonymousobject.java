class Demo{
    int id;
    void showId(int id){
        System.out.println(+ id);
    }
}
class AnonymousObject{
    public static void main(String[] args){
        new Demo().showId(101);
    }
}