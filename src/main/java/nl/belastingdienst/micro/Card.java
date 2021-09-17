package nl.belastingdienst.micro;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private final int cardId;
    private String name;
    private String address;
    private String City;
    private double credit;

    private List<Card> cards;

    public Card(int cardId){
        this(cardId, "NoName", "NoAddress", "NoCity", 500d);
    }

    public Card(int cardId, double credit){
        this(cardId,"NoName", "NoAddress", "NoCity", credit);
    }

    public Card(int cardId, String name, double credit) {
        this(cardId,name,"NoAddress", "NoCity",credit);
    }

    public Card(int cardId, String name, String address, String city, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.address = address;
        City = city;
        this.credit = credit;
        //addCard(this);
    }

    public int getCardId() {
        return cardId;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    void addCard(Card card) {
        cards.add(card);
    }

    List getCards(){
        return cards;
    }

    Object getCardByIndex(int index){
        return getCards().get(index);
    }

    boolean pay(int amount) {
        if (amount > getCredit()) {
            throw new PaymentFailedException("Payment Failed");
        }else {
            setCredit(getCredit() - amount);
            return true;
        }
    }



}
