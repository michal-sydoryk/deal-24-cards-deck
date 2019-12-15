package com.pandziobak.app;

public enum CardFace {
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    AS;

    @Override
    public String toString() {
        return this.name();
    }
}
