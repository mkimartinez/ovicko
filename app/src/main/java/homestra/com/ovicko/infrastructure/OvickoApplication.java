package homestra.com.ovicko.infrastructure;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ovicko on 03/11/2016.
 * The Application class
 */

public class OvickoApplication extends Application{
    private Auth auth;

    @Override
    public  void onCreate(){
        super.onCreate();
        auth = new Auth(this);
    }

    public Auth getAuth() {
        return auth;
    }
}
