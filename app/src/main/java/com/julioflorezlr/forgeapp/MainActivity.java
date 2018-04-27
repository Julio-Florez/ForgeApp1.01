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
        configExportBuildCard();
        configImportBuildCard();
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

    private void configExportBuildCard(){
        CardView cardView_Create = (CardView) findViewById(R.id.cardView_Export);
        cardView_Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BuildExport.class));
            }
        });
    }

    private void configImportBuildCard(){
        CardView cardView_Create = (CardView) findViewById(R.id.cardView_Import);
        cardView_Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BuildImport.class));
            }
        });
    }
}
