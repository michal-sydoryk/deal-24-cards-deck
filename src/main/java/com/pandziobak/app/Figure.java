package com.pandziobak.app;

public enum Figure {
    CLUB((char)2660),
    DIAMOND((char)2663),
    HEART((char)2665),
    SPADES((char)2666);

    char sign;

    Figure(char sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return String.valueOf(this.sign);
    }
}
