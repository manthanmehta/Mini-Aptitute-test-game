package com.example.swapniltamrkar.aptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityJ extends AppCompatActivity {

    int p;
    private static final int REQUEST_CODE = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j);

        Bundle bundle=getIntent().getExtras();
        p=bundle.getInt( "Mainkey" );
        String s=Integer.toString( p );
        if(bundle!=null)
        {
            Toast.makeText( this,s,Toast.LENGTH_SHORT ).show();

        }

    }


    public void RadioClick(View view)
    {
        switch (view.getId())
        {
            case R.id.rbj1:
                Toast.makeText( this,"Option 1",Toast.LENGTH_SHORT).show();
                break;

            case R.id.rbj2:
                Toast.makeText( this,"Option 2",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.rbj3:
                Toast.makeText( this,"Option 3",Toast.LENGTH_SHORT ).show();
                p++;
                break;

            case R.id.rbj4:
                Toast.makeText( this,"Option 4",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.next:
                Intent intent=new Intent( this,Score.class);
                intent.putExtra( "Mainkey",p );
                startActivityForResult( intent,REQUEST_CODE);
                break;



        }



    }
}
