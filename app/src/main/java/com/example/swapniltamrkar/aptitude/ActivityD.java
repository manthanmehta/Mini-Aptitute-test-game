package com.example.swapniltamrkar.aptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityD extends AppCompatActivity {

    int p;
    private static final int REQUEST_CODE = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            p = bundle.getInt( "MainKey" );
            String s = Integer.toString( p );
            Toast.makeText( this, s, Toast.LENGTH_LONG ).show();
        }
    }



    public void RadioClick(View view)
    {
        // boolean checked=((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.rbd1:
                Toast.makeText(this,"option 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbd2:
                Toast.makeText(this,"option 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbd3:
                Toast.makeText(this,"option 3",Toast.LENGTH_SHORT).show();
                p++;
                break;
            case R.id.rbd4:
                Toast.makeText(this,"option 4",Toast.LENGTH_SHORT).show();
                break;

            case R.id.next:

                Intent intent=new Intent(this,ActivityE.class);
                intent.putExtra( "MainKey", p );
                startActivityForResult( intent,REQUEST_CODE);


        }


    }


}

