package pattern.structural.facade;

import static pattern.structural.facade.DBType.MySQL;
import static pattern.structural.facade.DBType.Oracle;
import static pattern.structural.facade.ReportType.HTML;
import static pattern.structural.facade.ReportType.PDF;

public class TestFacadePattern {


    public static void main(String[] args) {
        ReportGeneratorFacade.generateReport(MySQL, PDF);
        ReportGeneratorFacade.generateReport(MySQL, HTML);

        ReportGeneratorFacade.generateReport(Oracle, PDF);
        ReportGeneratorFacade.generateReport(Oracle, HTML);
    }

}
