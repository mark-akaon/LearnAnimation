package net.cattaka.learnanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by takao on 2015/10/28.
 */
public class At2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_at_2);
    }
}
