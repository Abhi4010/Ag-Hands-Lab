package com.lab.hands.ag.expensehandler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class PurchaseLogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_log);
      String range = getIntent().getStringExtra(getString(R.string.range));
        if(range.equalsIgnoreCase("7"))
            Toast.makeText(this,"John needs to add log 7 days" ,Toast.LENGTH_LONG).show();
        if(range.equalsIgnoreCase("30"))
            Toast.makeText(this,"John needs to add log 30 days" ,Toast.LENGTH_LONG).show();

    }
}
