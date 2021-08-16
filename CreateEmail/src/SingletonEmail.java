public class SingletonEmail {
    private static SingletonEmail instance;
    private String nameEmail;

    private SingletonEmail(String nameEmail) {
        this.nameEmail = nameEmail;
    }

    public static SingletonEmail getInstance(String nameEmail) {
        if (instance == null) {
            instance = new SingletonEmail(nameEmail);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Email{" +
                "nameEmail='" + nameEmail + '\'' +
                '}';
    }
}
