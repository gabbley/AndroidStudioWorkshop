package com.gabbley.androidstudioworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gabbley.androidstudioworkshop.R;

public class HelloWorldHackBI extends AppCompatActivity {

    Button btnChange;
    TextView txtMain;
    EditText txtEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world_hack_bi);
        initialSetup();
    }

    public void initialSetup(){
        btnChange = (Button) findViewById(R.id.btnChangeText);
        txtMain = (TextView) findViewById(R.id.txtMainText);
        txtEnter = (EditText) findViewById(R.id.txtEditText);
    }

    public void changeText(View view){
        if (txtEnter.getText().length() > 0){
            txtMain.setText(txtEnter.getText());
        }
        else{
            txtEnter.setHint("Please enter new text");
        }
    }
}
