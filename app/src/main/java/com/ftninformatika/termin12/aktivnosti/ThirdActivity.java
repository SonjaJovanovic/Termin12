package com.ftninformatika.termin12.aktivnosti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ftninformatika.termin12.R;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }



    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getBaseContext(),"onStart third activity",Toast.LENGTH_SHORT).show();
        Log.i("thirdActivity", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getBaseContext(),"onRestart third activity",Toast.LENGTH_SHORT).show();
        Log.i("thirdActivity", "onRestart");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getBaseContext(),"onResume third activity",Toast.LENGTH_SHORT).show();
        Log.i("thirdActivity", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();


        Toast.makeText(getBaseContext(),"onPause third activity",Toast.LENGTH_SHORT).show();
        Log.i("thirdActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();


        Toast.makeText(getBaseContext(),"onStop third activity",Toast.LENGTH_SHORT).show();
        Log.i("thirdActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        Toast.makeText(getBaseContext(),"onDestroy third activity",Toast.LENGTH_SHORT).show();
        Log.i("thirdActivity", "onDestroy");
    }

}
