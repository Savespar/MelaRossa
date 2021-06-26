import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ActionsBox {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        HeavyBox box1 = new HeavyBox(4.5, "Ball");
        HeavyBox box2 = new HeavyBox(5, "Apple");
        HeavyBox box3 = new HeavyBox(5.8, "Mouse");
        HeavyBox box4 = new HeavyBox(7.5, "box");
        HeavyBox box5 = new HeavyBox(4.9, "Food");
        heavyBoxes.add(box1);
        heavyBoxes.add(box2);
        heavyBoxes.add(box3);
        heavyBoxes.add(box4);
        heavyBoxes.add(box5);
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box.content + " " + box.weight);
        }
        box1.setWeight(box1.weight - 1);
        heavyBoxes.remove(heavyBoxes.size() - 1);
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box.content + " " + box.weight);
        }
        Iterator iterator = heavyBoxes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
