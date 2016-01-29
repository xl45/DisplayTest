package edu.indiana.soic.xl45.displaytest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.round_activity_main);
    }

    public void changeColor(View view) {
        switch (i%6) {
            case 0:
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                break;
            case 1:
                getWindow().getDecorView().setBackgroundColor(Color.BLACK);
                break;
            case 2:
                getWindow().getDecorView().setBackgroundColor(Color.RED);
                break;
            case 3:
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                break;
            case 4:
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                break;
            case 5:
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                break;
        }

        i++;
    }
}
