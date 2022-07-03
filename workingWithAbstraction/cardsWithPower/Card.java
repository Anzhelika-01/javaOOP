package workingWithAbstraction.cardsWithPower;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;
    int power;

    Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
        this.power = power;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return cardRank.getPower() + cardSuit.getPower();
    }

    @Override
    public String toString() {
        return "Card name: " + getCardRank() +
                " of " + getCardSuit() +
                "; Card power: " + getPower();
    }
}