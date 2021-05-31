public class T1Z9 {
    public static void main(String[] args) {
        int sec = 86399;
        int day, hour, min;
        day = sec / (60 * 60 * 24);
        hour = (sec - day * 24 * 60 * 60) / 3600;
        min = (sec - day * 24 * 60 * 60 - hour * 3600) / 60;
        sec -= (day * 24 * 60 * 60 + hour * 3600 + min * 60);
        System.out.println("Day " + day + " Hour " + hour + " Minute " + min + " Second " + sec);
    }
}
