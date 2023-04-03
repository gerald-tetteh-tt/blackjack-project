package io.turntabl.dealer;

import io.turntabl.card.Card;
import io.turntabl.card.CardSuit;
import io.turntabl.card.CardValue;

import java.util.ArrayList;

public class Dealer {
    // holds a deck of cards
    private final ArrayList<Card> deck;

    public Dealer() {
        this.deck = new ArrayList<>();
        generateCards();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    // generate 52 cards and store them
    // in the deck
    private void generateCards() {
        for(var suit: CardSuit.values()) {
            for(var cardValue: CardValue.values()) {
                Card card = new Card(suit,cardValue);
                deck.add(card);
            }
        }
    }

    // remove a card from the
    // top of the deck
    public Card deal() {
        int lastIndex = deck.size() - 1;
        Card card = deck.get(lastIndex);
        deck.remove(lastIndex);
        return card;
    }
}
