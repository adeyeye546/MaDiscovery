package com.example.adeye.madiscovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageButton FAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FAB = (ImageButton) findViewById(R.id.imageButton);
        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ActivityCreateEvent.class);
                startActivity(i);
            }
        });
    }

    public void save(View v) {
        Toast.makeText(getBaseContext(),"Event Saved Successfully",Toast.LENGTH_LONG).show();

    }
    public void clear(View v) {
        Toast.makeText(getBaseContext(),"Event cleared Successfully",Toast.LENGTH_LONG).show();

    }
    public void showMap(View v) {
        Toast.makeText(getBaseContext(),"Event Map Showed",Toast.LENGTH_LONG).show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void showTime(View view)
    {
        DialogHandler dialogHandler = new DialogHandler();
        dialogHandler.show(getFragmentManager(),"time_picker");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.search_id:
                Toast.makeText(getApplicationContext(),"Search Options Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.photo_id:
                Toast.makeText(getApplicationContext(),"Photo Options Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.camera_id:
                Toast.makeText(getApplicationContext(),"Camera Options Selected", Toast.LENGTH_LONG).show();
                return  true;
            case R.id.settings_id:
                Toast.makeText(getApplicationContext(),"Settings Options Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.delete_id:
                Toast.makeText(getApplicationContext(),"Event Deleted", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }
}



