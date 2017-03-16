package pattern.facade;

public class ReportGeneratorFacade {

    /*
        The facade handles all the complexity to deal with interfaces and makes it easier for
        clients to generate report based on db type and report type
        
        This one is also shows factory pattern in between to get DBReportGenerator
        
        so this example is facade + factory
    */
    public static void generateReport(DBType dbType, ReportType reportType) {
        DBReportGenerator reportGenerator = DBReportGeneratorFactory.getReportGenerator(dbType);
        switch (reportType) {
            case PDF:
                reportGenerator.generatePdfReport();
                break;
            case HTML:
                reportGenerator.generateHtmlReport();
                break;
            default:
                throw new IllegalArgumentException("not a valid report type " + reportType);
        }

    }

}
