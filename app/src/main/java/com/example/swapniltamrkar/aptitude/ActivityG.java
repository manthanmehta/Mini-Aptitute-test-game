package com.example.swapniltamrkar.aptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityG extends AppCompatActivity {

    int p;
    private static final int REQUEST_CODE = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null)
        {
            p=bundle.getInt( "Mainkey" );

            String s=Integer.toString( p );
            Toast.makeText( this,s,Toast.LENGTH_SHORT ).show();
        }

    }

    public void RadioClick(View view)
    {
        switch(view.getId())
        {
            case R.id.rbg1:
                Toast.makeText( this,"option 1",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.rbg2:
                Toast.makeText( this,"option 2",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.rbg3:
                Toast.makeText( this,"option 3",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.rbg4:
                Toast.makeText( this,"option 4",Toast.LENGTH_SHORT ).show();
                p++;
                break;

            case R.id.next:

                Intent intent=new Intent( this,ActivityH.class);
                intent.putExtra( "Mainkey",p );
                startActivityForResult( intent,REQUEST_CODE );
        }
    }
}
