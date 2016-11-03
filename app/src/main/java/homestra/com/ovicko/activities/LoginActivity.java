package homestra.com.ovicko.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import homestra.com.ovicko.R;

/**
 * Created by ovicko on 03/11/2016.
 */

public class LoginActivity  extends  BaseActivity{
    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_login);
    }

    public void doLogin(View view) {
        application.getAuth().getUser().setLoggedIn(true);
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
