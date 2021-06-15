public class Driver {

    private String fullName;
    private int experience;

    public Driver(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    public String toString() {
        return "Full name: " + getFullName()+ "; experience:  " + getExperience();
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public int getExperience() {
        return experience;
    }
}
