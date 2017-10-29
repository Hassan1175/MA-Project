package mobile_application.ma_start;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);



    }
    public void main (View view){
        if(view.getId()==R.id.button){
            Intent i = new Intent(Signup.this,main_entry.class);

            startActivity(i);
        }




    }
}
