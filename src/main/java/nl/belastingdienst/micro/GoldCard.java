package nl.belastingdienst.micro;

public class GoldCard extends Card {
    private int discount;

    public GoldCard(int cardId) {
        super(cardId);
    }

    public GoldCard(int cardId, double credit, int discount) {
        super(cardId, credit);
        this.discount = discount;
    }

    public GoldCard(int cardId, String name ,double credit, int discount){
        super(cardId, name, credit);
        this.discount = discount;
    }

    public GoldCard(int cardId, String name, String address, String city, double credit, int discount) {
        super(cardId, name, address, city, credit);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) throws InvalidDiscountException {
        if (discount < 1 || discount > 30) {
            throw new InvalidDiscountException(discount + " out of discount range");
        } else {
            this.discount = discount;
        }
    }

    boolean pay(int amount) {
            if (amount < getDiscount()){
                amount = 0;
            }
            setCredit(getCredit() - amount );
            return true;
    }

}
