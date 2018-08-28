package org.game.cardplay;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    private List<Card> cards;
    private String name;

    Player(String name){
        this.name = name;
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        card.setPlayer(this);
        cards.add(card);
    }
}
