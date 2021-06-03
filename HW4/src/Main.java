public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Just God", 2021);
        person2.talk(person2.getFullName());
        person1.move(person1.getFullName());
    }
}
