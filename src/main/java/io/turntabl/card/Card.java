package io.turntabl.card;
// hello there
// please work now
// thired one

// another one
// final testing

/// next test
public class Card {
    private final CardSuit suit;
    private final CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value.getValue();
    }
}
