package com.pandziobak.app;

import java.util.*;

public class Main {
    static LinkedList<Card> deck;
    static Map<String, List<Card>> playersHands;

    public static void main(String[] args) {
        int playerNumber;
        try{
            playerNumber = Integer.valueOf(args[0]);
            deck = createDeck();
            playersHands = createEmptyHandsForPlayers(playerNumber);
            dealCards();
            printPlayersHands();
        }
        catch (NumberFormatException e){
            System.out.printf("Give a number in args[0] !!");
        }

    }

    static LinkedList<Card> createDeck(){
        LinkedList<Card> deck = new LinkedList<>();

        for (CardFigure cardFigure: CardFigure.values()){
            for (CardFace cardFace: CardFace.values()){
                deck.add(new Card(cardFace, cardFigure));
            }
        }
        Collections.shuffle(deck);

        return deck;
    }

    static Map<String, List<Card>> createEmptyHandsForPlayers(int playerNumber){
        Map<String, List<Card>> playersHand = new LinkedHashMap<>();

        for(int i = 0; i < playerNumber; i++){
            String playerName = "Player " + (i+1);
            playersHand.put(playerName, new LinkedList<>());
        }

        return playersHand;
    }

    private static void dealCards() {
        List<String> players = new LinkedList<>(playersHands.keySet());
        int playerIterator = 1;
        int playerNumber = players.size();
        
        while (!deck.isEmpty()){
            playersHands.get(players.get(playerIterator-1)).add(deck.pop());
            playerIterator++;
            if (playerIterator > playerNumber) playerIterator = 1;
        }
    }

    private static void printPlayersHands() {
        for(String player: playersHands.keySet()){
            System.out.println(player);
            System.out.println(playersHands.get(player).toString());
            System.out.println();
        }
    }

}
