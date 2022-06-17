package tz.co.vanuserve.fragmentdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Manin Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Main Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Main Called");
    }
}