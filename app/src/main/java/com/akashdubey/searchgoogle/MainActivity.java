 package com.akashdubey.searchgoogle;

import android.app.SearchManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

 public class MainActivity extends AppCompatActivity {

    EditText search;
    Button go;
    Intent myIntent=new Intent(Intent.ACTION_WEB_SEARCH);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search=(EditText) findViewById(R.id.search);
        go=(Button) findViewById(R.id.go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSearch();
            }
        });


    }

    public  void goSearch(){

        String query= search.getText().toString();   // store user input to query
        myIntent.putExtra(SearchManager.QUERY, query); // using putExtra for passing data
                                                        // SearchManager class provides access to android search capabilities
                                                        //and  QUERY constant is used to obtain data from our intent
        startActivity(myIntent);                        // passing intent to startactivity


    }
}
