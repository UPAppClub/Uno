package edu.up.appclub.uno;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;

import edu.up.appclub.uno.animation.Animator;

/**
 * Created by Eric Imperio on 11/2/2016.
 */

public class UnoAnimation implements Animator {

    private final int INTERVAL = 60;

    public UnoAnimation(){

    }

    /**
     * Interval between animation frames: .03 seconds (i.e., about 33 times
     * per second).
     *
     * @return the time interval between frames, in milliseconds.
     */
    public int interval() {
        return INTERVAL;
    }

    /**
     * The background color: a light blue.
     *
     * @return the background color onto which we will draw the image.
     */
    public int backgroundColor() {
        // create/return the background color
        return Color.rgb(128,128,128); // middle grey
    }

    /**
     * Action to perform on clock tick
     *
     * @param g the graphics object on which to draw
     */
    public void tick(Canvas g) {

    }

    /**
     * Tells that we never pause.
     *
     * @return indication of whether to pause
     */
    public boolean doPause() {
        return false;
    }

    /**
     * Tells that we never stop the animation.
     *
     * @return indication of whether to quit.
     */
    public boolean doQuit() {
        return false;
    }

    /**
     * reverse the ball's direction when the screen is tapped
     */
    public void onTouch(MotionEvent event)
    {

    }
}
