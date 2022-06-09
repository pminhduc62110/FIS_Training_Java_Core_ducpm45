package repo.dao.jdbc;

import core.CriminalCase;
import core.Detective;
import core.enums.CaseStatus;
import core.enums.CaseType;
import core.enums.EmploymentStatus;
import core.enums.Rank;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class CriminalCaseDAOJDBCTest {

    @Test
    void create() throws SQLException {
        Detective d1 = new Detective.Builder()
                .setId(1)
                .setUserName("detective1")
                .setFirstName("Pham")
                .setLastName("Minh Duc")
                .setPassword("phamminhduc@")
                .setBadgeNumber("007")
                .setRank(Rank.INSPECTOR)
                .setStatus(EmploymentStatus.ACTIVE)
                .build();
        CriminalCase c1 = new CriminalCase.Builder()
                .setId(2)
                .setNumber("HS1")
                .setType(CaseType.FELONY)
                .setStatus(CaseStatus.DISMISSED)
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