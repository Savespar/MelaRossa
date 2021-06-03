public class Person {
    private int age;
    private String fullName;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(String fullName) {
        if (fullName!= null && !fullName.isEmpty()) {
            System.out.println(fullName + " Говорит");
        } else System.out.println("NoName говорит");
    }

    public void talk(String fullName) {
        if (fullName!= null && !fullName.isEmpty()) {
            System.out.println(fullName + " Идет");
        } else System.out.println("NoName Идет");
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
