package top.wuhaojie.multiswitchbutton;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
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
                Snackbar.make(findViewById(R.id.cl_main), "多级开关拨动到: " + progress, Snackbar.LENGTH_SHORT).show();
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
