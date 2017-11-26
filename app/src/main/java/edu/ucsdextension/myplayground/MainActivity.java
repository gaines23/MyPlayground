package edu.ucsdextension.myplayground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonBuzzfeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBuzzfeed = (Button) findViewById(R.id.buttonBuzzfeed);
        buttonBuzzfeed.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonBuzzfeed:
                Intent b;
                b = new Intent(this, BuzzFeedActivity.class);
                startActivity(b);
                break;
        }
    }
}
