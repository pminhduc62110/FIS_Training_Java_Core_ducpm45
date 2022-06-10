package repo.dao.jdbc;

import core.Evidence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repo.connectpool.DataSource;
import repo.dao.IEvidenceDAO;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EvidenceDAOJDBC implements IEvidenceDAO {
    private static final Logger log = LoggerFactory.getLogger(CriminalCaseDAOJDBC.class);
    @Override
    public void create(Evidence evidence) {
        String query = "INSERT INTO evidence_list\n" +
                "VALUE (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try(Connection con = DataSource.getConnection()) {
            assert con != null;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, evidence.getId());
            ps.setInt(2, evidence.getVersion());
            ps.setString(3, localDateTimeToString(LocalDateTime.now()));
            ps.setString(4, localDateTimeToString(LocalDateTime.now()));
            ps.setString(5, evidence.getCriminalCase().getNumber());
            ps.setInt(6, evidence.getStorage().getId());
            ps.setString(7, evidence.getNumber());
            ps.setString(8, evidence.getItemName());
            ps.setString(9, evidence.getNotes());
            ps.setBoolean(10, evidence.getArchived());
            if(ps.executeUpdate() < 0) {
                log.error("Them khong thanh cong!");
            } else {
                log.info("Them thanh cong!");
            }
        } catch (SQLException e) {
            log.error(e.toString());
        }
    }

    @Override
    public Optional<List<Evidence>> getAll() {
        String query = "select * from evidence_list;";
        List<Evidence> evidenceList = new ArrayList<>();
        try(Connection con = DataSource.getConnection()) {
            assert con != null;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                Evidence evidence = new Evidence.Builder()
                        .setId(rs.getInt(1))
                        .setVersion(rs.getInt(2))
                        .setCreatedAt(stringToLocalDateTime(rs.getString(3)))
                        .setModifiedAt(stringToLocalDateTime(rs.getString(4)))
                        .setNumber(rs.getString(7))
                        .setItemName(rs.getString(8))
                        .setNotes(rs.getString(9))
                        .setArchived(rs.getBoolean(10))
                        .build();
                evidenceList.add(evidence);
            }
        } catch (SQLException e) {
            log.error(e.toString());
        }
        return Optional.of(evidenceList);
    }

    @Override
    public void update(Evidence item) {

    }

    @Override
    public void delete(Evidence item) {

    }
}
