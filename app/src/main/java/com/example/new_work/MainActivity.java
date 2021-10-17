package com.example.new_work;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //this is made for the button
    Button b1;
    EditText e1;//we make an object corresponding to the edit text;
    EditText e2;//we make an object corresponding to the edit text;
    TextView an;
    //For each component that we use we need to make an object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.button1);
        e1= findViewById(R.id.num1);//for all the objects we access there id using R.if.(NAME WE GAVE AS ID).
        e2= findViewById(R.id.num2);
        an= findViewById(R.id.ans);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=0,n2=0;
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Number not entered!!",Toast.LENGTH_LONG).show();
                }
                else
                    {
                    n1 = Integer.parseInt(e1.getText().toString());//converting the string to integer
                    n2 = Integer.parseInt(e2.getText().toString());
                    int num = n1 + n2;
                    an.setText(num+"");//Adding the empty quotes makes the number a string
                    }

            }
        });
    }
}

/*creating a string object
 * as getText() is of the type editable so we added .toString() to change it to string
 * we need to extract the text what we get in the edit text hence we use getText()*/
//Toast.makeText(MainActivity.this,"Ans:"+num,Toast.LENGTH_SHORT).show();
//final TextView ans = findViewById(R.id.ans);
//an.setText(num+"");//Adding the empty quotes makes the number a string