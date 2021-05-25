public class T1Z9 {
    public static void main(String[] args) {
        int sec = 86401;
        int day = 0, hour = 0, min = 0;
        day = sec / (60 * 60 * 24);
        hour = (sec - day * 24 * 60 * 60) / 3600;
        min = (sec - day * 24 * 60 * 60 - hour * 3600) / 60;
        sec -= (day * 24 * 60 * 60 + hour * 3600 + min * 60);
        System.out.println("Day " + day + " Hour " + hour + " Minute " + min + " Second " + sec);
    }
}
