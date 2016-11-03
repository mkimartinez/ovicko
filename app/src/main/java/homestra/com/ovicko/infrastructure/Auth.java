package homestra.com.ovicko.infrastructure;

import android.content.Context;

/**
 * Created by ovicko on 03/11/2016.
 */

public class Auth {
    private  final Context context;
    private  User user;

    public Auth(Context context) {
        this.context = context;

        //instantiate user object
        user = new User();
    }

    public User getUser() {
        return user;
    }

    //get user

}


