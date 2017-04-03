package com.example.fikrirahmanto.justinmind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ProgressBar;

public class RegisFive extends RootActivity {
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_five);
        pb = (ProgressBar) findViewById(R.id.progressBar3);
        pb.setProgress(3);
    }
    float x1, y1;
    float x2, y2;
    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            }
            case MotionEvent.ACTION_UP: {
                x2 = touchevent.getX();
                y2 = touchevent.getY();
// if right to left sweep event on screen
                if (x1 < x2) {
                    Intent i = new Intent(RegisFive.this, RegisTwo.class);
                    startActivity(i);
                }


            }
        }
        return false;
    }
}
