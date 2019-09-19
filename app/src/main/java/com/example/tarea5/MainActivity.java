package com.example.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String colorHex = "#FFFFFF";

    TextView r,G,B,FF;
    View view3;
    SeekBar seekBarR,seekBarG,seekBarB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View colorSample = findViewById(R.id.view3);
        colorSample.setBackgroundColor(Color.parseColor(colorHex));


         seekBarR = findViewById(R.id.seekBarR);
         r = findViewById(R.id.R);

        seekBarG = findViewById(R.id.seekBarG);
        G = findViewById(R.id.G);

        seekBarB = findViewById(R.id.seekBarB);
        B = findViewById(R.id.B);

        FF = findViewById(R.id.FF);

        seekBarR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                r.setText("rojo" + i);
                String hex = "#" + ColorUtils.decimalToHex(seekBarR.getProgress())+ ColorUtils.decimalToHex(seekBarB.getProgress()) + ColorUtils.decimalToHex(seekBarG.getProgress());
                view3.setBackgroundColor(Color.parseColor(hex));
                FF.setBackgroundColor(Color.parseColor(hex));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                r.setText("rojo" + i);
                String hex = "#" + ColorUtils.decimalToHex(seekBarR.getProgress())+ ColorUtils.decimalToHex(seekBarB.getProgress()) + ColorUtils.decimalToHex(seekBarG.getProgress());
                view3.setBackgroundColor(Color.parseColor(hex));
                FF.setBackgroundColor(Color.parseColor(hex));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                r.setText("rojo" + i);
                String hex = "#" + ColorUtils.decimalToHex(seekBarR.getProgress())+ ColorUtils.decimalToHex(seekBarB.getProgress()) + ColorUtils.decimalToHex(seekBarG.getProgress());
                view3.setBackgroundColor(Color.parseColor(hex));
                FF.setBackgroundColor(Color.parseColor(hex));
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
