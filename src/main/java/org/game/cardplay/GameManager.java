package org.game.cardplay;

public class GameManager
{

    public void play() {
        String[] players = {"Prathamesh", "Satyajeet", "Rohit"};
        Game game = new CardGame(players);

        game.shuffleAndDistributeCards(5);
        game.getCurrentPlayer().toString();
        game.playCard(1);

    }
}
