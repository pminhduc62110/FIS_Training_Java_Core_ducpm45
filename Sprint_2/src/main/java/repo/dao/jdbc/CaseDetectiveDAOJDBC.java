package repo.dao.jdbc;

import core.Detective;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repo.connectpool.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CaseDetectiveDAOJDBC {
    private static final Logger log = LoggerFactory.getLogger(CriminalCaseDAOJDBC.class);

    public Set<Detective> findDetectiveByCaseNumber(String case_number) {
        DetectiveDAOJDBC ddj = new DetectiveDAOJDBC();
        Set<Detective> detectiveSet = new HashSet<>();
        List<String> badgeNumberList = getListDetective(case_number);
        for (String d : badgeNumberList) {
            detectiveSet.add(ddj.findByBadgeNumber(d));
        }
        return detectiveSet;
    }
    public List<String> getListDetective(String case_number) {
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
        return listCaseNumber;
    }
}
