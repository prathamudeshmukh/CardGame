package org.game.cardplay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class CardGame implements Game
{

    private Players players;
    private Map<Integer, Player> roundWinner = new HashMap<>();
    private Map<Integer, List<Card>> roundcards = new HashMap<>();

    private List<Card> currentRoundCards;
    private int roundInProgress;
    private Player lastPlayer;

    CardGame(String[] playerNames) {
        players = new Players(playerNames);
        currentRoundCards = new ArrayList<Card>();
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
        lastPlayer = players.lastPlayer();
    }

    public Player getCurrentPlayer() {
        return players.currentPlayer();
    }

    @Override
    public void playCard(int cardIndex)
    {
        currentRoundCards.add(players.currentPlayer().getCards().get(cardIndex));
        if (players.currentPlayer().equals(players.lastPlayer())) {

        }
    }
}
