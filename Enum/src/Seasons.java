public enum Seasons {
    WINTER(-15),
    SUMMER(25) {
        @Override
        void getDescription() {
            System.out.println("Теплое время года");
        }
    },
    SPRING(15),
    FALL(5);

    int t;

    Seasons(int t) {
        this.t = t;
    }

    void getDescription() {
        System.out.println("Холодное время года");
    }
}
