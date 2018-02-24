package com.example.android.tailor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void email(View view){

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:tailor@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "My Order");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void number(View view){

        String phone = "+48506453870";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "+48506453870", null));
        startActivity(intent);
    }

    public void adres(View view){
        Uri geo = Uri.parse("geo:52.224945, 20.990751?q=52.224945, 20.990751(Tailor)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, geo);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void www(View view){

        Uri page = Uri.parse("http://www.tailor.pl");
        Intent intent = new Intent(Intent.ACTION_VIEW, page);
        startActivity(intent);
    }

}
