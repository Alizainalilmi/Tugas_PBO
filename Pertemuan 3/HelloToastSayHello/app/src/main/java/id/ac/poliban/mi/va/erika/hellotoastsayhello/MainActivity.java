package id.ac.poliban.mi.va.erika.hellotoastsayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private TextView hitungan;
    private TextView tvMessage;
    private int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitungan = findViewById(R.id.tv_message);
        tvMessage = findViewById(R.id.tv_message);
    }

    public void showToast(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, HelloToast.class);
        String message = hitungan.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, LOG_TAG);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void showCount(View view) {
        mCount++;
        tvMessage.setText(String.valueOf(mCount));
    }
}