package org.game.cardplay;

public interface Game
{
    void shuffleAndDistributeCards(int cardsPerEachPlayer);

    Player getCurrentPlayer();

    void playCard(int cardIndex);
}
