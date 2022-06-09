package repo.dao.jdbc;

import core.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repo.connectpool.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;


class CriminalCaseDAOJDBCTest {

    @Test
    void create() throws SQLException {
        Detective d1 = new Detective.Builder()
                .setId(3)
                .setUserName("detective1")
                .setFirstName("Pham")
                .setLastName("Minh Duc")
                .setPassword("phamminhduc@")
                .setBadgeNumber("008")
                .setRank(Rank.INSPECTOR)
                .setStatus(EmploymentStatus.ACTIVE)
                .build();
        CriminalCase c1 = new CriminalCase.Builder()
                .setId(4)
                .setNumber("HS2")
                .setType(CaseType.FELONY)
                .setStatus(CaseStatus.IN_COURT)
                .setNotes("adfg")
                .setLeadInvestigator(d1)
                .build();

        CriminalCaseDAOJDBC dao = new CriminalCaseDAOJDBC();
        dao.create(c1);
    }

    @Test
    void findByNumber() throws SQLException {
        String case_number = "HS2";
        CriminalCaseDAOJDBC dao = new CriminalCaseDAOJDBC();
        Set<Detective> set = dao.findByNumber(case_number).getAssigned();
        Assertions.assertEquals(3, dao.findByNumber(case_number).getAssigned());
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
}