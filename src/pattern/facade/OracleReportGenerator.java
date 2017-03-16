package pattern.facade;

import java.sql.Connection;

public class OracleReportGenerator implements DBReportGenerator {

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void generatePdfReport() {
        System.out.println("generating oracle pdf report");
    }

    @Override
    public void generateHtmlReport() {
        System.out.println("generating oracle html report");
    }
}
