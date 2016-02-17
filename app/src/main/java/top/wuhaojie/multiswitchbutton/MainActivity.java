package top.wuhaojie.multiswitchbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar sb_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sb_main = (SeekBar) findViewById(R.id.sb_main);
        sb_main.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
//                int seekProgress = seekBar.getProgress();
//                if(seekProgress<13){
//                    seekBar.setProgress(0);
//                }else if(seekProgress>=13 && seekProgress<38){
//                    seekBar.setProgress(25);
//                }else if(seekProgress>=38 && seekProgress<63){
//                    seekBar.setProgress(50);
//                }else if(seekProgress>=63 && seekProgress<88){
//                    seekBar.setProgress(75);
//                }else if(seekProgress>=88){
//                    seekBar.setProgress(100);
//                }
            }
        });
    }
}
