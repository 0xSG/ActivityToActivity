package ap1.testbox.sooryagangarajk.com.exp1a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;


import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String str1 = intent.getExtras().getString("SG_Key");


        final TextView tvw = (TextView) findViewById(R.id.textView2);
        tvw.setText(str1);

    }
}
