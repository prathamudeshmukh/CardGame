package org.game.cardplay;

public class Card
{
    private Symbol symbol;
    private Value value;
    private Player player;

    Card(Symbol symbol, Value value) {
        this.symbol = symbol;
        this.value = value;
    }


    public void setPlayer(Player player) {
        this.player = player;
    }

}
