package fyp.registration;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void SIGNUP(View view){
        if (view.getId()==  R.id.SIGNUP){


            Intent i = new Intent(MainActivity.this,Signup.class);
         //   i.putExtra("username",str);
           // i.putExtra("username",);
            startActivity(i);




        }







    }





}
