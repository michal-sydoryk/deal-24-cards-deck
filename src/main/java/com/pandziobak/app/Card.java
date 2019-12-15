package com.pandziobak.app;

public enum Card {
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
