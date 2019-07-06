package com.example.swapniltamrkar.aptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


    public int points;
    Button button;
    RadioButton rba1,rba2,rba3,rba4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.startbutton);
    }



   public void onStartActivityA(View view)
   {

       Intent intent=new Intent(MainActivity.this,ActivityA.class);
      // Intent intent=new Intent(MainActivity.this,ActivityH.class);
       startActivity(intent);
   }

}
