package com.ftninformatika.termin12.aktivnosti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ftninformatika.termin12.R;

public class DrugaAktivnost extends Activity {

    private static final int REQUEST_IMAGE_CAPTURE = 0;



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_aktivnost);

        Toast.makeText(getBaseContext(),"onCreate druge aktivnosti",Toast.LENGTH_SHORT).show();
        Log.i("DrugaAktivnost", "onCreate");

    }


    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getBaseContext(),"onStart druge aktivnosti",Toast.LENGTH_SHORT).show();
        Log.i("DrugaAktivnost", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getBaseContext(),"onRestart druge aktivnosti",Toast.LENGTH_SHORT).show();
        Log.i("DrugaAktivnost", "onRestart");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getBaseContext(),"onResume druge aktivnosti",Toast.LENGTH_SHORT).show();
        Log.i("DrugaAktivnost", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();


        Toast.makeText(getBaseContext(),"onPause druge aktivnosti",Toast.LENGTH_SHORT).show();
        Log.i("DrugaAktivnost", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();


        Toast.makeText(getBaseContext(),"onStop druge aktivnosti",Toast.LENGTH_SHORT).show();
        Log.i("DrugaAktivnost", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        Toast.makeText(getBaseContext(),"onDestroy druge aktivnosti",Toast.LENGTH_SHORT).show();
        Log.i("DrugaAktivnost", "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        Toast.makeText(getBaseContext(),"onSaveInstanceState",Toast.LENGTH_SHORT).show();
        Log.i("DrugaAktivnost", "onSaveInstanceState");

    }

    public void btnStartActivityCliked (View v) {

        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);

    }

    public void btnOpenCameraCliked (View v) {

        Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_IMAGE_CAPTURE) {
            if(data != null) {
                Toast.makeText(getBaseContext(), data.getData().toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
