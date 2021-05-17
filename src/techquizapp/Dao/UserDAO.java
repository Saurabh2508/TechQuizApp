
package techquizapp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.User;


public class UserDAO {
    public static boolean validateUser(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    public static void RegisterStudent(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        ps.executeUpdate();
    }
    public static void ChangePassword(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where userid=?");
        ps.setString(2, user.getUserId());
        ps.setString(1, user.getPassword());
        ps.executeUpdate();
    }
}
