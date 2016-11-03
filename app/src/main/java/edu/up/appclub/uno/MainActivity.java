package edu.up.appclub.uno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.up.appclub.uno.animation.AnimationSurface;

public class MainActivity extends AppCompatActivity {
    private UnoAnimation animator;

    UnoState u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u = new UnoState();

        // Connect the animation surface with the animator
        AnimationSurface mySurface = (AnimationSurface) this.findViewById(R.id.animationSurface);
        animator = new UnoAnimation();
        mySurface.setAnimator(animator);
    }
}
