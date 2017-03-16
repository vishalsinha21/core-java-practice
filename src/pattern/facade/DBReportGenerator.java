package pattern.facade;

import java.sql.Connection;

public interface DBReportGenerator {
    
    public Connection getConnection();
    public void generatePdfReport();
    public void generateHtmlReport();

}
