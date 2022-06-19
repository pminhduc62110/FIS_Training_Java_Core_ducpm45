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
<<<<<<< Updated upstream
    void getAll() {
=======
    void getAll() throws SQLException {
        CriminalCaseDAOJDBC ccdj = new CriminalCaseDAOJDBC();
        try {
            Assertions.assertEquals(5, ccdj.getAll().get().size());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        MatcherAssert.assertThat(5, CoreMatchers.is(CoreMatchers.equalTo(ccdj.getAll().get().size())));
>>>>>>> Stashed changes
    }

    @Test
    void update() {
    }

    @Test
<<<<<<< Updated upstream
    void delete() {
=======
    void delete() throws SQLException {
        CriminalCaseDAOJDBC ccdj = new CriminalCaseDAOJDBC();
        CriminalCase c = ccdj.findByNumber("HS003");
        ccdj.delete(c);
        Assertions.assertEquals(4, ccdj.getAll().get().size());
    }

    @AfterEach
    void afterEach() {
        CriminalCaseDAOJDBC ccdj = new CriminalCaseDAOJDBC();
        ccdj.deleteAll();
>>>>>>> Stashed changes
    }
}