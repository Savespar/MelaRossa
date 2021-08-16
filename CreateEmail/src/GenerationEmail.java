import java.io.IOException;

public class GenerationEmail {
    public static void main(String[] args) throws IOException {
        //System.out.println("Your mail:");
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String mail = reader.readLine();
        SingletonEmail email = SingletonEmail.getInstance("mailName@mail.domen");
        System.out.println(email);
        SingletonEmail email1 = SingletonEmail.getInstance("mailName222@mail.domen");
        System.out.println(email1);
    }
}
