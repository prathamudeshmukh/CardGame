package org.game.cardplay;

public enum Value
{
    ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(1), QUEEN(12), KING(13);

    private final int rank;

    Value(int rank) {
        this.rank = rank;
    }

    private double value() {
        return this.rank;
    }

}
