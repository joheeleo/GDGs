package com.example.gdgs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Launcher_activity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;
    private LeaderFragment mLeaderFragment;
    private SkillFragment mSkillFragment;


//animation variable
    Animation topAnim;
    ImageView launcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher_activity);
        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);

        //hooks
        launcher = findViewById(R.id.my_launcher);

        launcher.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Launcher_activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);



    }
}