import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dean {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Student student1 = new Student("Germiona", 2, 6.7);
        Student student2 = new Student("Garry", 2, 5.7);
        Student student3 = new Student("Ron", 1, 2.0);
        Student student4 = new Student("Drako", 3, 1.6);
        Student student5 = new Student("Luna", 5, 9);

        List<Student> studentsList = new ArrayList<>();

        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        studentFate(studentsList);
        System.out.println("Enter course:");
        int course = Integer.parseInt(reader.readLine());
        printStudent(studentsList, course);
        reader.close();
    }

    static void printStudent(List<Student> studentsList, int course) {
        int count = 0;
        for (Student student : studentsList) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                count++;
            }
        }
        if(count == 0){
            System.out.println("No student");
        }
    }

    public static void studentFate(List<Student> studentsList) {
        Iterator<Student> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageScore() < 3) {
                System.out.println(student + " deducted");
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
                System.out.println(student + " transferred to the course " + student.getCourse());
            }
        }
    }
}
