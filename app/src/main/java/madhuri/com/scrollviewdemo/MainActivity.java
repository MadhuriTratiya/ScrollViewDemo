package madhuri.com.scrollviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void RK_University(View view) {

        // Implicit Intent

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rku.ac.in/"));
        startActivity(intent);
    }

    public void explicitintent(View view) {

    }
}