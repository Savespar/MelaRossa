public class Student {
    private String name;
    private int course;
    private  double averageScore;

    public Student(String name, int course, double averageScore){
        this.name = name;
        this.course = course;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        String s = "Student " + name + " Course " + course + " Average score " + averageScore;
        return s;
    }
}
