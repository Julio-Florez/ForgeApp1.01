package com.julioflorezlr.forgeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configCreateBuildCard();
    }

    private void configCreateBuildCard(){
        CardView cardView_Create = (CardView) findViewById(R.id.cardView_Create);
        cardView_Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClassList.class));
            }
        });
    }
}
