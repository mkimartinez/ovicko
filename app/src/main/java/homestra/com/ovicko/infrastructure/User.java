package homestra.com.ovicko.infrastructure;

/**
 * Created by ovicko on 03/11/2016.
 * contains info about the logged in user
 * each field two methods,one to get the field,one to set the field
 * fields are not prefixed or underscored
 */

public class User {
    private  int id;//user id
    private  String userName;
    private  String displayName;
    private  String avatarUrl;
    private  boolean isLoggedIn;
    private  boolean hasPassword;
    private  String email;

    public  int getId(){
        return  id;//gets the id of the logged user
    }

    public  void setId(int id){
        this.id=id;//sets the id
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public boolean isHasPassword() {
        return hasPassword;
    }

    public void setHasPassword(boolean hasPassword) {
        this.hasPassword = hasPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
