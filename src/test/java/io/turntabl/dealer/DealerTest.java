package io.turntabl.dealer;

import io.turntabl.card.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {

    private Dealer dealer;

    @BeforeEach
    void setUp() {
        dealer = new Dealer();
    }

    @Test
    void generateDeck() {
        var deck = dealer.getDeck();
        HashSet<Card> hashSet = new HashSet<>(deck);
        assertEquals(52,deck.size());
        assertEquals(52,hashSet.size());
    }

    @Test
    void getDeck() {
        var deck = dealer.getDeck();
        assertNotNull(deck);
    }

    @Test
    void deal() {
        var card = dealer.deal();
        var deck = dealer.getDeck();
        assertEquals(51,deck.size());
        assertFalse(deck.contains(card));
    }
}