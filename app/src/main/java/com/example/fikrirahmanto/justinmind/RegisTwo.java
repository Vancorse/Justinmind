package com.example.fikrirahmanto.justinmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class RegisTwo extends RootActivity {
    TextView nameTexty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_two);
        nameTexty = (TextView) findViewById(R.id.nameText);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        nameTexty.setText(name);
    }
    public void goToRegisThree (View view){
        Intent intent = new Intent (this, RegisThree.class);
        startActivity(intent);
    }
    public void goToRegisFive (View view){
        Intent intent = new Intent (this, RegisFive.class);
        startActivity(intent);
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
                    Intent i = new Intent(RegisTwo.this, RegisOne.class);
                    startActivity(i);
                }


            }
        }
        return false;
    }
}
