package repo.dao.jdbc;

import core.CriminalCase;
import core.enums.CaseStatus;
import core.enums.CaseType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CriminalCaseMapper {
    private static final Logger log = LoggerFactory.getLogger(CriminalCaseMapper.class);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    public static CriminalCase.Builder getCriminalCase(ResultSet criminalCaseResultSet){
        try {
            CriminalCase.Builder criminalCase = new CriminalCase.Builder();

            criminalCase.setId(criminalCaseResultSet.getLong(1));
            LocalDateTime dateTimeCreate = LocalDateTime.parse(criminalCaseResultSet.getString(2), formatter);
            criminalCase.setCreatedAt(dateTimeCreate);
            LocalDateTime dateTimeModified = LocalDateTime.parse(criminalCaseResultSet.getString(3), formatter);
            criminalCase.setModifiedAt(dateTimeModified);
            criminalCase.setNumber(criminalCaseResultSet.getString(4));
            criminalCase.setType(CaseType.valueOf(criminalCaseResultSet.getString(5)));
            criminalCase.setShortDescription(criminalCaseResultSet.getString(6));
            criminalCase.setStatus(CaseStatus.valueOf(criminalCaseResultSet.getString(7)));
            criminalCase.setNotes(criminalCaseResultSet.getString(8));

            return criminalCase;
        }catch (SQLException ex){
            log.error(ex.toString());
        }
        return null;
    }
}
