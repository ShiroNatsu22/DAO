import java.util.List;

/**
 * Created by jgarcias on 01/12/16.
 */
public class User {

    private String host;
    private String user;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    User(String host, String user) {
        this.host = host;
        this.user = user;
    }



}