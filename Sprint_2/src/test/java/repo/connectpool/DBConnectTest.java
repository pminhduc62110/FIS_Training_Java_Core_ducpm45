package repo.connectpool;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnectTest {
    private static final Logger log = LoggerFactory.getLogger(DataSource.class);
    @Test
    void getConnection() {
        String dbName = "sprint_2";
        String connectURL = "jdbc:mysql://localhost:3306/" + dbName;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String password = "123456";
            String userName = "root";
            con = DriverManager.getConnection(connectURL, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            log.error(e.toString());
        }
    }
}