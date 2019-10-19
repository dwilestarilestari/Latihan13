package id.ac.tari.latihan13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvResult = findViewById(R.id.tvResult);
        String file = "Tari";
        SharedPreferences sp = getSharedPreferences(file, Context.MODE_PRIVATE);
        String lname = sp.getString("lname", "na" );
        String fname = sp.getString("fname", "na" );

        tvResult.setText(String.format("%s %s", lname, fname));
    }
}
