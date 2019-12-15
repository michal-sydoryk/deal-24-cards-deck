package com.epam.academy.app;

public enum CardFigure {
    CLUB("\u2660"),
    DIAMOND("\u2663"),
    HEART("\u2665"),
    SPADES("\u2666");

    String sign;

    CardFigure(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return this.sign;
    }
}
