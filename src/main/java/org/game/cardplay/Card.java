package org.game.cardplay;

import org.json.JSONObject;

public class Card
{
    private Symbol symbol;
    private Value value;
    private Player player;

    private static String JSON_KEY_SYMBOL = "symbol";
    private static String JSON_KEY_VALUE = "value";

    Card(Symbol symbol, Value value) {
        this.symbol = symbol;
        this.value = value;
    }


    public void setPlayer(Player player) {
        this.player = player;
    }

    public String toString() {
        JSONObject cardJSON = new JSONObject();
        cardJSON.put(JSON_KEY_SYMBOL, symbol.toString());
        cardJSON.put(JSON_KEY_VALUE, value.toString());
        return cardJSON.toString();
    }

}
