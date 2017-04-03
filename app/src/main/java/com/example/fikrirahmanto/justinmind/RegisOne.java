package com.example.fikrirahmanto.justinmind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class RegisOne extends RootActivity {
    TextView nameTexty;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_one);
        nameTexty = (TextView) findViewById(R.id.nameText);
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        nameTexty.setText(name);
    }
    public void goToRegisTwo (View view){
        Intent intent = new Intent (this, RegisTwo.class);
        intent.putExtra("name", nameTexty.getText().toString());
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
                    Intent i = new Intent(RegisOne.this, RegisterName.class);
                    startActivity(i);
                }


            }
        }
        return false;
    }
}

