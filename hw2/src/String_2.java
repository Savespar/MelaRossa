public class String_2 {
    public static void main(String[] args) {
        int count = 1000;
        int i = 1;
        String line = Integer.toString(i);
         while (line.length() < count){
             i++;
             if (Integer.toString(i).length() + line.length() > count) {
                 break;
             } else line+= Integer.toString(i);
        }
        System.out.println(line);
        System.out.println(line.length());
    }
}
