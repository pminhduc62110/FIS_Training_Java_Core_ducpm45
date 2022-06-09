package repo.dao.jdbc;

import core.Detective;
import core.EmploymentStatus;
import core.Rank;
import org.junit.jupiter.api.Test;
import repo.connectpool.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DetectiveDAOJDBCTest {

    @Test
    void create() {
    }

    @Test
    void getAll() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void findByBadgeNumber() {
        String badgeNumber = "HC003";
        DetectiveDAOJDBC ddj = new DetectiveDAOJDBC();
        System.out.println(ddj.findByBadgeNumber(badgeNumber));
    }
}