package Andreea.JavaBasics2;

public class Blackjack {
    public static void main(String[] args) {
        Blackjack object = new Blackjack();
        System.out.println(object.firstTurn("king", "ace", "seven"));
    }

    public static int parseCard(String card) {

        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        int firstCard = parseCard(card1);
        int secondCard = parseCard(card2);
        return (firstCard + secondCard == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack == true && dealerScore != 10 && dealerScore != 11) {
            return "W";
        }
        return "S";

    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        }

        if (handScore <= 11) {
            return "H";
        }

        if (dealerScore >= 7) {
            return "H";
        }

        return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return this.largeHand(this.isBlackjack(card1, card2), dealerScore);
        } else {
            return this.smallHand(handScore, dealerScore);
        }
    }
}