package pattern.structural.facade;

import java.sql.Connection;

public class MySQLReportGenerator implements DBReportGenerator {

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void generatePdfReport() {
        System.out.println("generating mysql pdf report");
    }

    @Override
    public void generateHtmlReport() {
        System.out.println("generating mysql html report");
    }
}
