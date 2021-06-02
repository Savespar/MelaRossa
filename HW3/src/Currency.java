public class Currency {
    String nameCurrency;
    double course;

    public Currency(String nameCurrency, double course) {
        this.nameCurrency = nameCurrency;
        this.course = course;
    }

    public String getNameCurrency() {
        return nameCurrency;
    }

    public double getCourse() {
        return course;
    }

    public void setNameCurrency(String nameCurrency) {
        this.nameCurrency = nameCurrency;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}
