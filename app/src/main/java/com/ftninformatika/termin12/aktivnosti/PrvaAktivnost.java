package com.ftninformatika.termin12.aktivnosti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ftninformatika.termin12.R;

public class PrvaAktivnost extends Activity {

    private int a;
    private double b;
    private String c;

    private static final int PICK_CONTACT_REQUEST = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prva_aktivnost);


        if (savedInstanceState != null) {
            a = savedInstanceState.getInt("a");
            b = savedInstanceState.getDouble("b");
            c = savedInstanceState.getString("c");
        }


        Toast t = Toast.makeText(getBaseContext(), "onCreate prve aktivnosti", Toast.LENGTH_SHORT);
        t.show();
        Log.i("PrvaAktivnost", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getBaseContext(), "onStart prve aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("PrvaAktivnost", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getBaseContext(), "onRestart prve aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("PrvaAktivnost", "onRestart");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getBaseContext(), "onResume prve aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("PrvaAktivnost", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();


        Toast.makeText(getBaseContext(), "onPause prve aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("PrvaAktivnost", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();


        Toast.makeText(getBaseContext(), "onStop prve aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("PrvaAktivnost", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        Toast.makeText(getBaseContext(), "onDestroy prve aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("PrvaAktivnost", "onDestroy");
    }

    public void klikNaDugme1(View v) {
        Toast.makeText(getBaseContext(), "klik na dugme1", Toast.LENGTH_SHORT).show();
        Log.i("PrvaAktivnost", "klik na dugme1");

    }

    public void klikNaDugme2(View v) {
        Intent intent = new Intent(this, DrugaAktivnost.class);
        startActivity(intent);
    }

    public void klikNaDugme3(View v) {
        Intent intent = new Intent(this, DrugaAktivnost.class);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("a", a);
        outState.putDouble("b", b);
        outState.putString("c", c);

        Toast.makeText(getBaseContext(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
        Log.i("PrvaAktivnost", "onSaveInstanceState");

    }

    public void onButtonClick(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_PICK);
        intent.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivityForResult(intent, PICK_CONTACT_REQUEST);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_CONTACT_REQUEST) {
            if (data != null) {
                Toast.makeText(getBaseContext(), data.getData().toString(), Toast.LENGTH_SHORT).show();
            }
        }

    }
}
