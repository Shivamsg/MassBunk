package com.example.shiva.massbunk;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    EditText user_name,user_id,user_pass;
    RadioButton yes,no;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        user_name=(EditText)findViewById(R.id.Name);
        user_pass=(EditText)findViewById(R.id.Password);
        user_id=(EditText)findViewById(R.id.ID);
        yes=(RadioButton)findViewById(R.id.r1);
        no=(RadioButton)findViewById(R.id.r2);
        submit=(Button)findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String Name= user_name.getText().toString();
                String password= user_pass.getText().toString();
                String id= user_id.getText().toString();

                Snackbar.make(v, Name + "Response Submitted", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Toast.makeText(MainActivity.this,"Mass Bunk APPROVED!!",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this,ConfirmAct.class);
                startActivity(intent);
            }
        }

        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
