package eg.com.iti.fawry;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    ImageView imageViewLogo;
    TextView txtRights;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initComponents();

        animation.setAnimationListener(new Animation.AnimationListener(){
            @Override
            public void onAnimationStart(Animation arg0) {
            }
            @Override
            public void onAnimationRepeat(Animation arg0) {
            }
            @Override
            public void onAnimationEnd(Animation arg0) {

                Intent intent = new Intent(Splash.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void initComponents()
    {
        imageViewLogo = findViewById(R.id.imageViewLogo);
        txtRights = findViewById(R.id.txtRights);
        animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        imageViewLogo.startAnimation(animation);
        txtRights.startAnimation(animation);
        animation.setRepeatCount(1);
    }
}