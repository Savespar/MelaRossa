public class Weather {

    private int temperature;
    private String humidity;
    double windForce;

    public Weather(int temperature, String humidity, double windForce){
        this.temperature = temperature;
        this.humidity = humidity;
        this.windForce = windForce;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public double getWindForce() {
        return windForce;
    }

    public void setWindForce(double windForce) {
        this.windForce = windForce;
    }
}
