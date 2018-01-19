package com.gabbley.androidstudioworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gabbley.androidstudioworkshop.R;

public class HelloWorldHackBI extends AppCompatActivity {

    /*
    * Components declared as global fields
    * Can be accessed anywhere in app
    * */
    Button btnChange;
    TextView txtMain;
    EditText txtEnter;

    /*
    * Runs when app is initialized
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world_hack_bi);
        initialSetup(); //method to initialize all components needed at start of app
    }

    /*
    * Declare/Initialize/Set anything you want the moment the app opens
    * */
    public void initialSetup(){
        btnChange = findViewById(R.id.btnChangeText); //ID that you chose in design
        txtMain = findViewById(R.id.txtMainText);
        txtEnter = findViewById(R.id.txtEditText);
    }

    /*
    * Changes the text of the TextView (txtMain) to text entered in EditText (txtEnter)
    * Runs when btnChange is clicked
    *
    * Choose the onClick in design
    * */
    public void changeText(View view){ //View parameter connects method to design
        if (txtEnter.getText().length() > 0){
            txtMain.setText(txtEnter.getText());
        }
        else{
            txtEnter.setHint("Please enter new text");
        }
    }
}
