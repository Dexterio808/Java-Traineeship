package nl.belastingdienst.micro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<Card> cards;
    private Scanner scanner = new Scanner(System.in);

    public App() {
        this.cards = new ArrayList<>();
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    String discount(Card card) {
        if (card instanceof GoldCard) {
            GoldCard tempGoldCard = (GoldCard) card;
            return String.valueOf(tempGoldCard.getDiscount());

        } else {
            return "";
        }
    }

    void searchAndPay(int cardId, int amount) {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getCardId() == cardId) {
                getCards().get(i).pay(amount);
            }
        }
    }

    int getInt() {
        return scanner.nextInt();
    }

    public void startApp() {

        displayCustomers();
        System.out.println();
        System.out.print("Enter thee cardID:   ");
        int cardId = getInt();
        System.out.print("Enter the amount to pay:   ");
        int amount = getInt();

        searchAndPay(cardId, amount);

        System.out.print("\n\n");
        displayCustomers();

    }

    private void displayCustomers() {
        System.out.printf("\n%-10s %-10s %-10s %-10s\n", "CardID", "Name", "Credit", "Discount");
        for (Card card : cards) {
            System.out.printf("%-10s %-10s %-10s %-10s\n"
                    , card.getCardId()
                    , card.getName()
                    , card.getCredit()
                    , discount(card));
        }
    }


}
