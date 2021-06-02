import java.math.BigDecimal;

public class Bank {
    public static void main(String[] args) {
        double money = 100;
        Card card_1 = new Card("Gendalf", "01", new BigDecimal(1000.67));
        System.out.println(card_1.getName());
        System.out.println(card_1.getCardID());
        System.out.println(card_1.getBalance());
        card_1.actualBalnce();
        card_1.withdrawMoney(money);
        card_1.actualBalnce();
        card_1.depositMoney(money);
        card_1.actualBalnce();
        Currency currency_1 = new Currency("Babaika", 2);
        card_1.balanceCurrency(currency_1);
        card_1.actualBalnce();
    }
}
