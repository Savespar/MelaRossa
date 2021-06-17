public class Main {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SUMMER;
        System.out.println(favoriteSeason);
        loveSeason(favoriteSeason);
        System.out.println();
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons.name() + " Средняя температура: " + seasons.t + " ");
            seasons.getDescription();
            System.out.println();
        }
    }

    public static void loveSeason(Seasons seasons) {
        switch (seasons) {
            case FALL -> System.out.println("Я люблю ОСЕНЬ");
            case SPRING -> System.out.println("Я люблю ВЕСНУ");
            case SUMMER -> System.out.println("Я люблю ЛЕТО");
            case WINTER -> System.out.println("Я люблю ЗИМУ");
            default -> System.out.println("НЕ СЕЗОН ЛЮБИТЬ)");
        }
    }

}
