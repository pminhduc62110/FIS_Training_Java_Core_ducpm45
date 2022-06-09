package repo.connectpool;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DataSourceTest {
    private static final String CONNECT_URL = "jdbc:mysql://localhost:3306/sprint_2";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123456";
    public static HikariConfig config = new HikariConfig();
    public static HikariDataSource hds;
    private static final Logger log = LoggerFactory.getLogger(DataSource.class);
    static {
        config.setJdbcUrl(CONNECT_URL);
        config.setUsername(USER_NAME);
        config.setPassword(PASSWORD);
        config.setMaximumPoolSize(10);
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        hds = new HikariDataSource(config);
    }
    @Test
    void getConnection() {
        try {
             hds.getConnection();
        } catch (SQLException e) {
            log.error(e.toString());
        }
    }
}