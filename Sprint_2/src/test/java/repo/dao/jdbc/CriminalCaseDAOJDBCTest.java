package repo.dao.jdbc;

import core.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;


class CriminalCaseDAOJDBCTest {

    @Test
    void create() throws SQLException {
        Detective d1 = new Detective.Builder()
                .setId(2)
                .setUserName("detective1")
                .setFirstName("Pham")
                .setLastName("Minh Duc")
                .setPassword("phamminhduc@")
                .setBadgeNumber("007")
                .setRank(Rank.INSPECTOR)
                .setStatus(EmploymentStatus.ACTIVE)
                .build();
        CriminalCase c1 = new CriminalCase.Builder()
                .setId(3)
                .setNumber("HS2")
                .setType(CaseType.FELONY)
                .setStatus(CaseStatus.IN_COURT)
                .setNotes("ABC")
                .setLeadInvestigator(d1)
                .build();

        CriminalCaseDAOJDBC dao = new CriminalCaseDAOJDBC();
        dao.create(c1);
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