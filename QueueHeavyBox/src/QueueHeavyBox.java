import java.util.ArrayDeque;

public class QueueHeavyBox {
    public static void main(String[] args) {
        ArrayDeque<HeavyBox2> heavyBox2s = new ArrayDeque<>();
        HeavyBox2 box1 = new HeavyBox2(4.5, "Ball");
        HeavyBox2 box2 = new HeavyBox2(5, "Apple");
        HeavyBox2 box3 = new HeavyBox2(5.8, "Mouse");
        HeavyBox2 box4 = new HeavyBox2(7.5, "box");
        HeavyBox2 box5 = new HeavyBox2(4.9, "Food");
        heavyBox2s.offer(box1);
        heavyBox2s.offer(box2);
        heavyBox2s.offer(box3);
        heavyBox2s.offer(box4);
        heavyBox2s.offer(box5);
        for (HeavyBox2 box: heavyBox2s) {
            System.out.println(box);
        }
        heavyBox2s.poll();
        System.out.println();
        for (HeavyBox2 box: heavyBox2s) {
            System.out.println(box);
        }
    }
}
