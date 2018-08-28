package org.game.cardplay;

import java.util.List;
import java.util.stream.IntStream;

public class CardGame implements Game
{

    private Players players;
    CardGame(String[] playerNames) {
        players = new Players(playerNames);
    }

    public void shuffleAndDistributeCards(int cardsPerEachPlayer)
    {
        List<Card> cards = CardManager.getDeckCards();
        IntStream.rangeClosed(1, cardsPerEachPlayer).forEach(count -> {
            for (Card card : cards) {
                Player currentPlayer = players.currentPlayer();
                currentPlayer.addCard(card);
                players.rotate();
            }
        });
    }
}
