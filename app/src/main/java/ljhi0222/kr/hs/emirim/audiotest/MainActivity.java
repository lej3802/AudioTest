package ljhi0222.kr.hs.emirim.audiotest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch switchMusic;
    MediaPlayer musicplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchMusic = (Switch) findViewById(R.id.switch_music);
        musicplayer = MediaPlayer.create(this, R.raw.sleeptight);

        switchMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchMusic.isChecked())
                    musicplayer.start();
                else
                    musicplayer.pause();
            }
        });
    }

        protected void onStop() {
            super.onStop();
            musicplayer.stop();

    }
}
