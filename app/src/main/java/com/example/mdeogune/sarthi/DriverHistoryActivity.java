package com.example.mdeogune.sarthi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nEW u on 28-May-18.
 */

public class DriverHistoryActivity extends AppCompatActivity {

    private EditText mName,mVecID;
    private Button mLogout,b;
    private ImageView mProfileImage;
    public static TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_history);
        mName=(EditText)findViewById(R.id.name);
        mVecID=(EditText)findViewById(R.id.vec_id);
        mLogout=(Button)findViewById(R.id.logout);


        mProfileImage=(ImageView)findViewById(R.id.profileImage);
        b=(Button)findViewById(R.id.info);
        tv=(TextView)findViewById(R.id.display);
        tv.setMovementMethod(new ScrollingMovementMethod());
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                   fetchData process=new fetchData();
                   process.execute();
            }
        });
    }

}

