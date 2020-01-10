package Week4.ex77_LyyraCard;

public class ex77_LyyraCard {
    public static void main(String[] args) {
        LyyraCard newCard = new LyyraCard(100);
        System.out.println(newCard);

        newCard.payEconomical();
        System.out.println(newCard);

        newCard.payGourmet();
        newCard.payEconomical();
        System.out.println(newCard);

        newCard.loadMoney(15);
        System.out.println(newCard);
        newCard.loadMoney(10);
        System.out.println(newCard);
        newCard.loadMoney(200);
        System.out.println(newCard);

        newCard.loadMoney(-15);
        System.out.println(newCard);
    }
}
