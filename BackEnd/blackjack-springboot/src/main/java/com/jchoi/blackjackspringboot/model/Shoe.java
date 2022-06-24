package com.jchoi.blackjackspringboot.model;

import java.util.Random;

public class Shoe {
    private final int NUM_CARDS_IN_DECK = 52;
    private final Card[] cards = new Card[NUM_CARDS_IN_DECK];
    private final int[] cardValues = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 11};
    private final String[] cardSuits = new String[]{"Spade", "Club", "Diamond", "Heart"};

    public Shoe() {
        this.fillShoe();
    }

    public Card drawCard() {
        int randomCard = new Random().nextInt(this.cards.length);
        return this.cards[randomCard];
    }

    public void fillShoe() {
        int index = 0;
        for (String cardSuit : cardSuits) {
            for (int cardValue : cardValues) {
                Card nextCard = new Card(cardValue, cardSuit);
                cards[index] = nextCard;
                index++;
            }
        }
    }

    public Card[] getCards() {
        return cards;
    }
}