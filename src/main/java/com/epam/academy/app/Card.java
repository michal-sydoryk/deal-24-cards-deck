package com.epam.academy.app;

public class Card {
    private CardFace cardFace;
    private CardFigure cardFigure;

    public Card(CardFace cardFace, CardFigure cardFigure) {
        this.cardFace = cardFace;
        this.cardFigure = cardFigure;
    }

    @Override
    public String toString() {
        return "[ " + cardFace + " " + cardFigure + " ]";
    }
}
