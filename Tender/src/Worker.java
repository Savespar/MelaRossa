public class Worker {

    int numberProfessions;
    private Profession profession1;
    private Profession profession2;
    private Profession profession3;
    private int costWork;

    public Worker(int numberProfessions, Profession profession1, int costWork) {
        this.numberProfessions = numberProfessions;
        this.profession1 = profession1;
        this.costWork = costWork;
    }

    public Worker(int numberProfessions, Profession profession1, Profession profession2, int costWork) {
        this.numberProfessions = numberProfessions;
        this.profession1 = profession1;
        this.profession2 = profession2;
        this.costWork = costWork;
    }

    public Worker(int numberProfessions, Profession profession1, Profession profession2, Profession profession3, int costWork) {
        this.numberProfessions = numberProfessions;
        this.profession1 = profession1;
        this.profession2 = profession2;
        this.profession3 = profession3;
        this.costWork = costWork;
    }

    public int getNumberProfessions() {
        return numberProfessions;
    }

    public void setNumberProfessions(int numberProfessions) {
        this.numberProfessions = numberProfessions;
    }

    public Profession getProfession1() {
        return profession1;
    }

    public void setProfession1(Profession profession1) {
        this.profession1 = profession1;
    }

    public Profession getProfession2() {
        return profession2;
    }

    public void setProfession2(Profession profession2) {
        this.profession2 = profession2;
    }

    public Profession getProfession3() {
        return profession3;
    }

    public void setProfession3(Profession profession3) {
        this.profession3 = profession3;
    }

    public int getCostWork() {
        return costWork;
    }

    public void setCostWork(int costWork) {
        this.costWork = costWork;
    }
}
