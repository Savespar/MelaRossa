public class Solution {
    public static void main(String[] args) {
        Weather weather1 = new Weather(30, "7%", 14);
        Weather weather2 = new Weather(2, "77%", 6.3);
        Element element = new Element("Tornado");
        Pair<Weather, String> pair1 = new Pair<Weather, String>(weather1, "Red");
        Pair<Weather, Integer> pair2 = new Pair<Weather, Integer>(weather2, 3);
        Pair<Element, Integer> pair3 = new Pair<Element, Integer>(element, 9);
    }
}
