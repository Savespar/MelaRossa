public class CarBuilder {
    private final String engine;
    private final int powerEngine;
    private final String transmission;
    private boolean gps;
    private boolean navigator;

    public static class Builder {
        public String engine;
        public int powerEngine;
        public String transmission;
        public boolean gps = false;
        public boolean navigator = false;

        public Builder(String engine, int powerEngine, String transmission) {
            this.engine = engine;
            this.powerEngine = powerEngine;
            this.transmission = transmission;
        }

        public Builder gps(boolean val) {
            gps = val;
            return this;
        }

        public Builder navigator(boolean val) {
            navigator = val;
            return this;
        }

        public CarBuilder build() {
            return new CarBuilder(this);
        }
    }

    private CarBuilder(Builder builder) {
        engine = builder.engine;
        powerEngine = builder.powerEngine;
        transmission = builder.transmission;
        gps = builder.gps;
        navigator = builder.navigator;
    }

    @Override
    public String toString() {
        String s = "Enginne: " + this.engine + ";\n"
                + "Power engine: " + this.powerEngine + ";\n"
                + "Transnission: " + this.transmission + ";\n"
                + "GPS: " + this.gps + ";\n"
                + "Navigator " + this.navigator + ".\n";

        return s;
    }
}
