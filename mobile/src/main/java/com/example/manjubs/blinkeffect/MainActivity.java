package com.example.manjubs.blinkeffect;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView=(TextView) findViewById(R.id.txtBlink);
        btn=(Button) findViewById(R.id.btnStart);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                manageBlinkEffect();
            }
        });
    }
    public void manageBlinkEffect()
    {
        ObjectAnimator anim =ObjectAnimator.ofInt(txtView,"backgroundColor", Color.WHITE,Color.RED,Color.WHITE);
        anim.setDuration(1000);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        anim.start();
    }
}
