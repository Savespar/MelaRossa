import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.security.KeyStore;
import java.util.*;

public class Tender {
    public static void main(String[] args) {
        int priceTender = 60;
        int needCarpenter = 2, needMason = 4, needElectrician = 2;
        Map<String, Integer> admittedBrigades = new HashMap<>();


        ArrayList<ArrayList<Worker>> listBrigade = new ArrayList<>(); //список бригад участвующих в тендере
        //В бригаду добавляются работники с названиями специальностей и стоимостью их услуг
        //стоимость услуг бригады - сумма стоимости всех работников
        ArrayList<Worker> brigade1 = new ArrayList<>(Arrays.asList(
                new Worker(1, Profession.CARPENTER, 8),
                new Worker(1, Profession.CARPENTER, 8),
                new Worker(1, Profession.MASON, 5),
                new Worker(1, Profession.MASON, 5),
                new Worker(1, Profession.MASON, 5),
                new Worker(1, Profession.ELECTRICIAN, 10),
                new Worker(2, Profession.ELECTRICIAN, Profession.MASON, 12)));

        listBrigade.add(brigade1);

        ArrayList<Worker> brigade2 = new ArrayList<>(Arrays.asList(
                new Worker(1, Profession.CARPENTER, 3),
                new Worker(1, Profession.CARPENTER, 3),
                new Worker(1, Profession.MASON, 5),
                new Worker(1, Profession.MASON, 5),
                new Worker(1, Profession.MASON, 5),
                new Worker(1, Profession.ELECTRICIAN, 10),
                new Worker(2, Profession.ELECTRICIAN, Profession.MASON, 12)));

        listBrigade.add(brigade2);

        ArrayList<Worker> brigade3 = new ArrayList<>(Arrays.asList(
                new Worker(1, Profession.CARPENTER, 15),
                new Worker(1, Profession.CARPENTER, 30),
                new Worker(1, Profession.MASON, 5),
                new Worker(1, Profession.MASON, 5),
                new Worker(1, Profession.MASON, 5),
                new Worker(1, Profession.ELECTRICIAN, 10),
                new Worker(1, Profession.ELECTRICIAN, 12)));

        listBrigade.add(brigade3);
        //отбор бригад по условиям тендера. Сделано топорно. Заполняет мапу названиями бригад и их ценами
        for (int i = 0; i < listBrigade.size(); i++) {
            brigadeSelection(listBrigade.get(i), priceTender, needCarpenter, needMason, needElectrician, i + 1, admittedBrigades);
        }
        //Это просто проверка. Печает все бригады, прошедшие отбор
        for (Map.Entry entry : admittedBrigades.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //отбор бригады с наименьшей стоимостью услуг
        System.out.println(tenderResult((HashMap<String, Integer>) admittedBrigades));


    }

    public static void brigadeSelection(ArrayList<Worker> brigade, int priceTender, int needCarpenter, int needMason, int needElectrician, int numberBrigade, Map<String, Integer> admittedBrigades) {
        int countCarpenter = 0, countMason = 0, countElectrician = 0, price = 0;
        for (Worker worker : brigade) {
            price += worker.getCostWork();

            if (worker.getNumberProfessions() == 1) {
                switch (worker.getProfession1()) {
                    case MASON -> {
                        countMason++;
                        break;
                    }
                    case CARPENTER -> {
                        countCarpenter++;
                        break;
                    }
                    case ELECTRICIAN -> {
                        countElectrician++;
                        break;
                    }
                }
            } else {
                if (worker.getNumberProfessions() == 2) {
                    switch (worker.getProfession1()) {
                        case MASON -> {
                            countMason++;
                            break;
                        }
                        case CARPENTER -> {
                            countCarpenter++;
                            break;
                        }
                        case ELECTRICIAN -> {
                            countElectrician++;
                            break;
                        }
                    }
                    switch (worker.getProfession2()) {
                        case MASON -> {
                            countMason++;
                            break;
                        }
                        case CARPENTER -> {
                            countCarpenter++;
                            break;
                        }
                        case ELECTRICIAN -> {
                            countElectrician++;
                            break;
                        }
                    }
                }
            }
        }
        //System.out.println(price + " " + countCarpenter + " " + countMason + " " + countElectrician);
        if (price <= priceTender & countCarpenter == needCarpenter & countMason == needMason & countElectrician == needElectrician) {
            String s = "Brigade" + numberBrigade;
            admittedBrigades.put(s, price);
        }
    }

    public static String tenderResult(HashMap<String, Integer> admittedBrigades) {
        String nameBrigade = null;
        Integer min = Collections.min(admittedBrigades.values());
        for (Map.Entry<String, Integer> entry : admittedBrigades.entrySet()) {
            if (entry.getValue() == min) {
                nameBrigade = entry.getKey();
            }
        }
        return nameBrigade;
    }
}



