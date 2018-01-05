package com.example.wyx.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by wyx on 17-11-17.
 */

public class Act1 extends Activity{


    private Button btnWinXP;
    private Button btnWin7;
    private Button btnW10;
    private Button btnLi;
    private Button btnOS;
    private Button btnI;
    private Button btnA;
    private Button btnS;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act1);

        btnWinXP = findViewById(R.id.btnWinXP);
        btnWinXP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(Act1.this, Act4.class);

                startActivity(c);
            }
        });

        btnWin7 = findViewById(R.id.btnWin7);
        btnWin7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent d = new Intent(Act1.this,Act5.class);

                startActivity(d);
            }
        });


        btnW10 = findViewById(R.id.btnW10);
        btnW10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Act1.this,Act6.class);

                startActivity(e);
            }
        });

        btnLi = findViewById(R.id.btnLi);
        btnLi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Act1.this,Act7.class);

                startActivity(f);
            }
        });

        btnOS = findViewById(R.id.btnOS);
        btnOS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent g = new Intent(Act1.this,Act8.class);

                startActivity(g);
            }
        });


        btnA = findViewById(R.id.btnA);
        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent g = new Intent(Act1.this,Act9.class);

                startActivity(g);
            }
        });

        btnI = findViewById(R.id.btnI);
        btnI.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Act1.this,Act10.class);

                startActivity(k);
            }
        });

        btnS = findViewById(R.id.btnS);
        btnS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Act1.this,Act11.class);

                startActivity(j);
            }
        });

    }
}
