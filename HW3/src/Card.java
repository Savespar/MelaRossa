import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class Card {

    private String name;
    private String cardID;
    private BigDecimal balance;
    BigDecimal bd1;


    public Card(String name, String cardID, BigDecimal balance) {
        this.name = name;
        this.cardID = cardID;
        this.balance = balance;
    }

    public Card(String name, String cardID) {
        this.name = name;
        this.cardID = cardID;
    }

    public void actualBalnce() {
        System.out.println("Actual balance = " + balance.setScale(2, ROUND_HALF_UP));
    }

    public void withdrawMoney(double money) {
        BigDecimal bdMoney = BigDecimal.valueOf(money);
        if (bdMoney.compareTo(BigDecimal.valueOf(0)) == 1) {
            balance = balance.subtract(bdMoney);
        } else{
            System.out.println("ERROR SUMMA");
        }
    }

    public void depositMoney(double money) {
        BigDecimal bdMoney = BigDecimal.valueOf(money);
        if (bdMoney.compareTo(BigDecimal.valueOf(0)) == 1) {
            balance = balance.add(bdMoney);
        } else{
            System.out.println("ERROR SUMMA");
        }
    }

    public void balanceCurrency(Currency currency) {
        if (!currency.getNameCurrency().isEmpty() && currency.getCourse() > 0) {
            BigDecimal bdCourse = BigDecimal.valueOf(currency.getCourse());
            System.out.println("Course in " + currency.getNameCurrency() + " = " + balance.divide(bdCourse).setScale(2, ROUND_HALF_UP));
        }
    }

    public String getName() {
        return name;
    }

    public String getCardID() {
        return cardID;
    }

    public BigDecimal getBalance() {
        return balance.setScale(2, ROUND_HALF_UP);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
