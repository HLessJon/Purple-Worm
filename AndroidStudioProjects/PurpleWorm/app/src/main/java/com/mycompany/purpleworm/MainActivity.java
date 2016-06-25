package com.mycompany.purpleworm;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Integer A;
    ImageView wurmView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// creates a button and adds onclick listner to it.
        Button button = (Button) findViewById(R.id.button1);
        wurmView=(ImageView)findViewById(R.id.wurmBox);
         A =1;

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                if(A == 1)
                {
                wurmView.setImageResource(R.drawable.wurm2);
                A = 2;}
                else{
                    wurmView.setImageResource(R.drawable.wurm1);
                    A =1;
                }

                //regular toast
                //Toast.makeText(MainActivity.this, "The Worm has Turned", Toast.LENGTH_SHORT).show();
                //Big Toast

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.linearTeeth));

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText("The Worm has Turned");

//This is the THREE standard arguements for the toast
               /* Context context = MainActivity.this;
                CharSequence text =  "The Worm has Turned";
                int duration = Toast.LENGTH_SHORT;*/

//Toast toast = new Toast(getApplicationContext()); THIS is how it usually appears but
                //(MainActivity.this); works in this situation.
                Toast toast = new Toast(MainActivity.this);
                toast.setGravity(Gravity.TOP| Gravity.CENTER_VERTICAL, 0, 125);//X,Y (Vertical,Horizontal)
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);


                toast.show();
            }

        });

    }
    }

