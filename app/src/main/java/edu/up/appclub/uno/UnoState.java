package edu.up.appclub.uno;

import java.util.ArrayList;

/**
 * Created by Noah on 11/2/2016.
 */

public class UnoState {

    //instance variables

    private ArrayList<Card> drawPile;

    private ArrayList<Card> playedCards;

    private ArrayList<Card> humanPlayerCards;

    private ArrayList<Card> aiPlayerCards;

    private int playerIDs[] = new int[2];

    private String playerNames[] = new String[2];

    private int turnID;

    //Getters and Setters
    public int getTurnID() {
        return turnID;
    }






}
