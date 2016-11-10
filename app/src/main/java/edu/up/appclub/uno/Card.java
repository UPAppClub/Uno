package edu.up.appclub.uno;

import android.graphics.Canvas;

/**
 * Created by Eric Imperio on 11/2/2016.
 */

public class Card {
    private int value; //0-9,10-skip,11-reverse,12-+2,13-wild, 14-wild+4
    private char color; //r,g,b,y,w,+ (w = wild, + = wild+4)
    private static int HEIGHT = 100;
    private static int WIDTH = 100;

    public Card(int value, char color){
        this.value = value;
        this.color = color;
    }

    public void onDraw(Canvas c){

    }
}
