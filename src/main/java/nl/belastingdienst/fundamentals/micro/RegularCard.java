package nl.belastingdienst.fundamentals.micro;

public class RegularCard extends Card{

    public RegularCard(int cardId) {
        super(cardId);
    }

    public RegularCard(int cardId, double credit) {
        super(cardId, credit);
    }

    public RegularCard(int cardId, String name, double credit) {
        super(cardId, name, credit);
    }

    public RegularCard(int cardId, String name, String address, String city, double credit) {
        super(cardId, name, address, city, credit);
    }
}
