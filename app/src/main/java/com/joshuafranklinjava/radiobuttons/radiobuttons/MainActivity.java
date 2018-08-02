package com.joshuafranklinjava.radiobuttons.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

  private RadioGroup radioGroup;
  private RadioButton radioButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    radioGroup = (RadioGroup)findViewById(R.id.radioGroupID);
    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(RadioGroup radioGroup, int i) {
        radioButton = (RadioButton)findViewById(i);

        switch (radioButton.getId()) {
          case R.id.YesId: {
            Log.d("RD", "YES!!");
          }
          break;

          case R.id.NoID: {
            Log.d("RD", "NOPE!!");
          }
          break;

          case R.id.maybeID: {
            Log.d("RD", "MAYBE!!");
          }
        }
      }
    });
  }
}
