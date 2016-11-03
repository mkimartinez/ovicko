package homestra.com.ovicko.activities;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by ovicko on 03/11/2016.
 */

public abstract  class BaseAuthenticatedActivity extends BaseActivity {

    @Override

    protected  final  void  onCreate(Bundle savedState){
        //subclasses can not be overriden if we use the final
        super.onCreate(savedState);

        //if the user is not logged in
        if (!application.getAuth().getUser().isLoggedIn()){
            startActivity(new Intent(this,LoginActivity.class));
            finish();
            return;
        }

        onOvickoCreate(savedState);
    }

    protected abstract void onOvickoCreate(Bundle savedState);
}
