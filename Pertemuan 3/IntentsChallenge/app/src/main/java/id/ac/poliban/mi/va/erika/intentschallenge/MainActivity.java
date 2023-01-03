package id.ac.poliban.mi.va.erika.intentschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "id.ac.poliban.mi.va.erika.intentschallenge.extra.MESSAGE";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private TextView tvOne;
    private TextView tvTwo;
    private TextView tvThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOne = findViewById(R.id.tv_one);
        tvTwo = findViewById(R.id.tv_two);
        tvThree = findViewById(R.id.tv_three);
    }

    public void buttonone(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, TextOneActivity.class);
        String one = tvOne.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, one);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void buttontwo(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, TextTwoActivity.class);
        String two = tvTwo.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, two);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void buttonthree(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, TextThreeActivity.class);
        String three = tvThree.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, three);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}