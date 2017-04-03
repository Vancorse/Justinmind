package com.example.fikrirahmanto.justinmind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class RegisterPage extends RootActivity {
    float x1, y1;
    float x2, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
    }

    public void goToRegisterMain(View view) {
        Intent intent = new Intent(this, RegisterNotice.class);
        startActivity(intent);
//        this.overridePendingTransition(R.anim.slide_in_right,
//                R.anim.slide_out_left);
    }

    public void goToLogin(View view) {
        Intent intent = new Intent(this, MainRegistration.class);
        startActivity(intent);
//        this.overridePendingTransition(R.anim.slide_in_right,
//                R.anim.slide_out_left);
    }

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
                if (x1 > x2) {
                    Intent i = new Intent(RegisterPage.this, MainRegistration.class);

                    startActivity(i);
                }
// if right to left sweep event on screen
                if (x1 < x2) {
                    Intent i = new Intent(RegisterPage.this, FrontActivity.class);
                    startActivity(i);
                }


            }
        }
        return false;
    }
}




