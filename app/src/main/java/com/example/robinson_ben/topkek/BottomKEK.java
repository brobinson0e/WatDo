package com.example.robinson_ben.topkek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BottomKEK extends AppCompatActivity {
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_kek);
        Intent intent = getIntent();
        x = intent.getIntExtra("x", 0);
        System.out.println(x);
        TextView kek = (TextView) findViewById(R.id.textView);
        kek.setText(" " + x + " ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bottom_kek, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void intnet(View view) {
        Intent intents = new Intent(this, MainActivity.class);
        intents.putExtra("backX", x);
        startActivity(intents);
    }
}
