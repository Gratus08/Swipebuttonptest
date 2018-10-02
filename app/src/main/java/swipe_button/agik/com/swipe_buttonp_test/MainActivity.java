package swipe_button.agik.com.swipe_buttonp_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import swipe_button.agik.com.mylibrary.myfirst;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myfirst.Plus(4,5);
    }

}
