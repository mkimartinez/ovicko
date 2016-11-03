package homestra.com.ovicko.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import homestra.com.ovicko.infrastructure.OvickoApplication;

/**
 * Created by ovicko on 03/11/2016.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected OvickoApplication application;

    @Override
    protected  void  onCreate(Bundle savedState){
        super.onCreate(savedState);

        application = (OvickoApplication) getApplication();
    }
}
