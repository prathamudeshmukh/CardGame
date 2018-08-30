package org.game.cardplay;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    private static String JSON_KEY_PLAYER = "player";
    private static String JSON_KEY_CARDS = "cards";

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

    public List<Card> getCards() {
        return this.cards;
    }

    public String toString() {
        JSONObject playerJSON = new JSONObject();
        playerJSON.put(JSON_KEY_PLAYER, name);
        playerJSON.put(JSON_KEY_CARDS, new JSONArray(cards));
        return playerJSON.toString();
    }
}
