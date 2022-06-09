package repo.dao.jdbc;

import core.CriminalCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repo.connectpool.DataSource;
import repo.dao.ICriminalCaseDAO;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class CriminalCaseDAOJDBC implements ICriminalCaseDAO {
    private static final Logger log = LoggerFactory.getLogger(CriminalCaseDAOJDBC.class);
    @Override
    public void create(CriminalCase criminalCase) throws SQLException {
        String query = "INSERT INTO sprint_2.criminal_case_list\n" +
                "VALUE (?, ?, ?, ?, ?, ?, ?, ?,?);";
        try(Connection con = DataSource.getConnection()) {
            assert con != null;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, criminalCase.getId());
            ps.setString(2, localDateTimeToString(criminalCase.getCreatedAt()));
            ps.setString(3, localDateTimeToString(criminalCase.getModifiedAt()));
            ps.setString(4, criminalCase.getNumber());
            ps.setString(5, String.valueOf(criminalCase.getType()));
            ps.setString(6, criminalCase.getShortDescription());
            ps.setString(7, String.valueOf(criminalCase.getStatus()));
            ps.setString(8, criminalCase.getNotes());
            ps.setString(9, criminalCase.getLeadInvestigator().getBadgeNumber());
            ps.executeUpdate();
        } catch (SQLException e) {
            log.error(e.toString());
        }
    }

    @Override
    public Optional<CriminalCase> getAll() {
        String query = "select * from criminal_case_list;";
        try(Connection con = DataSource.getConnection()) {
            assert con != null;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    @Override
    public void update(CriminalCase item) {

    }

    @Override
    public void delete(CriminalCase item) {

    }

    private String localDateTimeToString(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);

    }
}
