package pattern.facade;

import static pattern.facade.DBType.MySQL;
import static pattern.facade.DBType.Oracle;
import static pattern.facade.ReportType.HTML;
import static pattern.facade.ReportType.PDF;

public class TestFacadePattern {


    public static void main(String[] args) {
        ReportGeneratorFacade.generateReport(MySQL, PDF);
        ReportGeneratorFacade.generateReport(MySQL, HTML);

        ReportGeneratorFacade.generateReport(Oracle, PDF);
        ReportGeneratorFacade.generateReport(Oracle, HTML);
    }

}
