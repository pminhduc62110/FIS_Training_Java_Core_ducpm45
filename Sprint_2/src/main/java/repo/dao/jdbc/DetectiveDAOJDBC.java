package repo.dao.jdbc;

import core.Detective;
import core.EmploymentStatus;
import core.Rank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repo.connectpool.DataSource;
import repo.dao.IDetectiveDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class DetectiveDAOJDBC implements IDetectiveDAO {
    private static final Logger log = LoggerFactory.getLogger(CriminalCaseDAOJDBC.class);
    @Override
    public void create(Detective item) throws SQLException {

    }

    @Override
    public Optional<Detective> getAll() {
        return Optional.empty();
    }

    @Override
    public void update(Detective item) {

    }

    @Override
    public void delete(Detective item) {

    }

    @Override
    public Detective findByBadgeNumber(String badgeNumber) {
        Detective.Builder detective = new Detective.Builder();
        String query = "select * from detective_list where badge_number = ?;";
        try(Connection con = DataSource.getConnection()) {
            assert con != null;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, badgeNumber);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                detective.setId(rs.getLong(1))
                        .setModifiedAt(stringToLocalDateTime(rs.getString(2)))
                        .setUserName(rs.getString(3))
                        .setFirstName(rs.getString(4))
                        .setLastName(rs.getString(5))
                        .setPassword(rs.getString(6))
                        .setHiringDate(stringToLocalDateTime(rs.getString(7)))
                        .setBadgeNumber(rs.getString(8))
                        .setRank(Rank.valueOf(rs.getString(9)))
                        .setArmed(rs.getBoolean(10))
                        .setStatus(EmploymentStatus.valueOf(rs.getString(11)));
            }
        } catch (SQLException e) {
            log.error(e.toString());
        }
        return detective.build();
    }
}
