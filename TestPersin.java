public class TestPersin {
    public static void main(String []args){
        Person p1= new Person("Ahmad",20);
        Person p2= new Person("Ahmad",20);
        System.out.println(p1.toString());
        System.out.println(p1.hashCode());
        System.out.println(p1.equals(p2));
    }
}
