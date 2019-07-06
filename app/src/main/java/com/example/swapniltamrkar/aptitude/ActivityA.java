package com.example.swapniltamrkar.aptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    private static final int REQUEST_CODE = 10;
   public int point=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitya);

    }

    public void RadioClick(View view)
    {
       // boolean checked=((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.rba1:
                Toast.makeText(this,"option 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rba2:
                Toast.makeText(this,"option 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rba3:
                Toast.makeText(this,"option 3",Toast.LENGTH_SHORT).show();
                point++;
                break;
            case R.id.rba4:
                Toast.makeText(this,"option 4",Toast.LENGTH_SHORT).show();
                break;

            case R.id.next:

                Intent intent=new Intent(this,ActivityB.class);
                intent.putExtra( "MainKey", point );
               startActivityForResult( intent,REQUEST_CODE);






        }




    }

}
