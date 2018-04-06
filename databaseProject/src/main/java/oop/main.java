
/**
 * @author ${huyhoang8398}
 *
 * ${Ken illasviel}
 */
package oop;
import javax.swing.*;
import java.sql.*;



public class main {
        // Kết nối vào MySQL.
        public static Connection getMySQLConnection() throws SQLException,
                ClassNotFoundException {
            String hostName = "localhost";

            String dbName = "project";
            String userName = "root";
            String password = "hoamoclan123";

            return getMySQLConnection(hostName, dbName, userName, password);
        }

        public static Connection getMySQLConnection(String hostName, String dbName,
                                                    String userName, String password) throws SQLException,
                ClassNotFoundException {
            // Khai báo class Driver cho DB MySQL
            // Việc này cần thiết với Java 5
            // Java6 tự động tìm kiếm Driver thích hợp.
            // Nếu bạn dùng Java6, thì ko cần dòng này cũng được.
            Class.forName("com.mysql.jdbc.Driver");

            // Cấu trúc URL Connection dành cho Oracle
            // Ví dụ: jdbc:mysql://localhost:3306/simplehr
            String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

            Connection conn = DriverManager.getConnection(connectionURL, userName,
                    password);
            return conn;
        }

    public static void main(String[] args)  {

        mainForm win = new mainForm();
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.pack();

        win.setVisible(true);

    }
}
