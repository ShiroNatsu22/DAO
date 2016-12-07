/**
 * Created by jgarcias on 02/12/16.
 * <p/>
 * Created by jgarcias on 01/12/16.
 */


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDAO {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://172.16.4.227/mysql";
    //list is working as a database
    List<User> users;
    static final String USER = "root";
    static final String PASS = "test";

    public UserDaoImpl() {



    }


    public List<User> getAllUser() {
        Connection conn = null;
        Statement stmt = null;
        try{

            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT host,user FROM user";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name

                String host = rs.getString("host");
                String user = rs.getString("user");
                User u = new User(host,user);
                users.add(u);

                //Display values

                System.out.print(", Host: " + host);
                System.out.println(", User: " + user);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }

        return users;
    }

    public User getUser(String host, String user) {
        return null;
    }
}

