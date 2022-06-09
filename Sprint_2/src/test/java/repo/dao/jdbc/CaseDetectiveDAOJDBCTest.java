package repo.dao.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repo.connectpool.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CaseDetectiveDAOJDBCTest {
    private static final Logger log = LoggerFactory.getLogger(CriminalCaseDAOJDBC.class);
    @Test
    void findDetectiveByCaseNumber() {
        String case_number = "HS2";
        CaseDetectiveDAOJDBC cdj = new CaseDetectiveDAOJDBC();

        Assertions.assertEquals(3, cdj.findDetectiveByCaseNumber(case_number));
    }

    @Test
    void getListDetective() {
        String case_number = "HS2";
        List<String> listCaseNumber = new ArrayList<>();
        String query = "select * from case_detective where case_number = ?;";
        try(Connection con = DataSource.getConnection()) {
            assert con != null;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, case_number);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                listCaseNumber.add(rs.getString(2));
            }
        } catch (SQLException e) {
            log.error(e.toString());
        }
        Assertions.assertEquals(3, listCaseNumber.size());
        listCaseNumber.forEach(System.out::println);
    }
}