package org.game.cardplay;

import java.util.ArrayList;
import java.util.List;

public class CardManager
{
    public static List<Card> getDeckCards() {
        List<Card> cards = new ArrayList<Card>();
        for (Symbol symbol : Symbol.values()) {
            for (Value value : Value.values()) {
                cards.add(new Card(symbol, value));
            }
        }
        return cards;
    }
}
