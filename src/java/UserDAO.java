import java.util.List;
/**
 * Created by jgarcias on 01/12/16.
 */
    public interface UserDAO {
         List<User> getAllUser();
         User getUser(String user);
         User getHost(String host);

    }


