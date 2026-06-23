public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Khalid", "123");
        Person p2 = new Student ("Ali", "124");
        Person p3 = new Lecturer("Ahmed", "125");

        p1.introduce();
        p2.introduce();
        p3.introduce();

    }
}