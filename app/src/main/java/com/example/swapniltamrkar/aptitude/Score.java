package com.example.swapniltamrkar.aptitude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Score extends AppCompatActivity {

    int p;
    TextView btn=findViewById( R.id.score );
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_score );

        Bundle bundle=getIntent().getExtras();
        p=bundle.getInt( "Mainkey" );
        String s=Integer.toString( p );
        if(bundle !=null) {
            Toast.makeText( this, s, Toast.LENGTH_SHORT ).show();
        }


    }

    public void RadioClick(View view)
    {
        switch (view.getId())
        {
            case R.id.see:
                String string=Integer.toString( p );
                btn.setText(string);

        }
    }

}

