/**
 * Created by Joshua on 11/12/2016.
 */

    public class DaoPatternDemo {
        public static void main(String[] args) {
            UserDAO userDao = new UserDaoImpl();

            //print all students
            for (User user: userDao.getAllUser()){
                System.out.println("Host: [Host : " + user.getHost() + ", User : " + user.getUser() + " ]");
            }



        }
    }

