import java.util.List;
/**
 * Created by jgarcias on 01/12/16.
 */
    public interface UserDAO {
        public List<User> getAllUser();
        public User getUser(String host, String user);

    }


