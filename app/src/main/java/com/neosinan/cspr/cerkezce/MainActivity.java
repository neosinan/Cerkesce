package com.neosinan.cspr.cerkezce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mColorsText;
    TextView mFamilyText;
    TextView mNumbersText;
    TextView mPhrasesText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mColorsText = (TextView) findViewById(R.id.color); //These 4 line is to find 4 clickable textviews
        mFamilyText = (TextView) findViewById(R.id.family);
        mNumbersText = (TextView) findViewById(R.id.numbers);
        mPhrasesText = (TextView) findViewById(R.id.phrases);
        mColorsText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendToAnother = new Intent(view.getContext(),ColorsActivity.class);
                startActivity(sendToAnother);
            }
        });
        mFamilyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendToAnother = new Intent(view.getContext(),FamilyActivity.class);
                startActivity(sendToAnother);
            }
        });
        mNumbersText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendToAnother = new Intent(view.getContext(),NumbersActivity.class);
                startActivity(sendToAnother);

            }
        });
        mPhrasesText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendToAnother = new Intent(view.getContext(),PhrasesActivity.class);
                startActivity(sendToAnother);

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.about_menu, menu);
        return true;
    }


    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        Intent ourintent = new Intent(this, AboutActivity.class);
        startActivity(ourintent);
        //Toast.makeText(HaftaSonuMainActivity.this,"About" + item.getTitle(), Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}
