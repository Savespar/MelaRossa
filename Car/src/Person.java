public class Person extends Driver {

    private int age;

    public Person(String fullName, int experience, int age) {
        super(fullName, experience);
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "; age: " + getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
