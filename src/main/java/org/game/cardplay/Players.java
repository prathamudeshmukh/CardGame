package org.game.cardplay;

import java.util.LinkedList;

public class Players
{
    private LinkedList<Player> players;

    Players(String[] playerNames) {
        players = new LinkedList<Player>();
        for (String name : playerNames) {
            players.add(new Player(name));
        }
    }

    public Player currentPlayer() {
        return players.peekFirst();
    }

    public void rotate(){
        Player firstPlayer = players.poll();
        players.addLast(firstPlayer);
    }

}
