package edu.up.appclub.uno;

import java.lang.reflect.Array;
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

    private int playerIDs[];

    private String playerNames[];

    private int turnID;

    public UnoState(){
        for(int i = 0; i<15;i++){
            if(i > 0 && i < 13){
                drawPile.add(new Card(i, 'r'));
                drawPile.add(new Card(i, 'y'));
                drawPile.add(new Card(i, 'g'));
                drawPile.add(new Card(i, 'b'));

                drawPile.add(new Card(i, 'r'));
                drawPile.add(new Card(i, 'y'));
                drawPile.add(new Card(i, 'g'));
                drawPile.add(new Card(i, 'b'));
            }else if(i == 0){
                drawPile.add(new Card(i, 'r'));
                drawPile.add(new Card(i, 'y'));
                drawPile.add(new Card(i, 'g'));
                drawPile.add(new Card(i, 'b'));
            }else if(i == 13){
                drawPile.add(new Card(i, 'w'));
                drawPile.add(new Card(i, 'w'));
                drawPile.add(new Card(i, 'w'));
                drawPile.add(new Card(i, 'w'));
            }else{
                drawPile.add(new Card(i, '+'));
                drawPile.add(new Card(i, '+'));
                drawPile.add(new Card(i, '+'));
                drawPile.add(new Card(i, '+'));
            }
        }
    }

    //Getters
    public int getTurnID() {
        return turnID;
    }

    public ArrayList<Card> getDrawPile(){ return drawPile; }

    public ArrayList<Card> getPlayedCards(){ return playedCards; }

    public ArrayList<Card> getHumanPlayerCards(){ return humanPlayerCards; }

    public ArrayList<Card> getAiPlayerCards(){ return aiPlayerCards; }

    public int[] getPlayerIDs(){ return playerIDs; }

    public String[] getPlayerNames(){ return playerNames; }

    //Setters
    public void setTurnID(int turnID){ this.turnID = turnID; }

    public void setDrawPile(ArrayList<Card> drawPile){this.drawPile = drawPile; }

    public void setPlayedCards(ArrayList<Card> playedCards){ this.playedCards = playedCards; }

    public void setAiPlayerCards(ArrayList<Card> aiPlayerCards){ this.aiPlayerCards = aiPlayerCards; }

    public void setHumanPlayerCards(ArrayList<Card> humanPlayerCards){ this.humanPlayerCards = humanPlayerCards; }

    public void setPlayerIDs(int[] playerIDs){ this.playerIDs = playerIDs; }

    public void setPlayerNames(String[] playerNames){ this.playerNames = playerNames; }
}
