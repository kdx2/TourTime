package com.tourtime.tourtime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by konyd on 11/03/2017.
 */

public class SplashScreen extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Log.d("testing", "onCreate of the splashscreen activity");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        final ImageView iv = (ImageView) findViewById(R.id.imageView);
        final Animation fadeIn = AnimationUtils.loadAnimation(getBaseContext(), R.anim.fade_in);
        final Animation fadeOut = AnimationUtils.loadAnimation(getBaseContext(), R.anim.fade_out);

        iv.startAnimation(fadeIn);
        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.startAnimation(fadeOut);
                finish();
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

}
