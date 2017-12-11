package com.xunevermore.filterbar;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FilterTab filterTab0 = (FilterTab) findViewById(R.id.filter_tab0);
        FilterTab filterTab1 = (FilterTab) findViewById(R.id.filter_tab1);
        FilterTab filterTab2 = (FilterTab) findViewById(R.id.filter_tab2);
        FilterTab filterTab3 = (FilterTab) findViewById(R.id.filter_tab3);

        filterTab0.setOnClickListener(this);
        filterTab1.setOnClickListener(this);
        filterTab2.setOnClickListener(this);
        filterTab3.setOnClickListener(this);


        FilterBar filterBar  = (FilterBar)findViewById(R.id.filter_bar);



    }

    @Override
    public void onClick(View v) {
        if(v instanceof FilterTab){
            ((FilterTab) v).setFilterTabSelected(!v.isSelected());
        }
    }
}
