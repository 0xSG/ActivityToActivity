package ap1.testbox.sooryagangarajk.com.exp1a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent =
                final EditText edittext =(EditText) findViewById(R.id.editText);
                String str1=edittext.getText().toString();

                Intent i = new Intent(MainActivity.this, DisplayMessageActivity.class);
                i.putExtra("SG_Key", str1);
                startActivity(i);

            }
        });



    }

   /* public void sendMessage(View view) {

        //  EditText editText = (EditText) findViewById(R.id.editText);
       // String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
    }
*/






}