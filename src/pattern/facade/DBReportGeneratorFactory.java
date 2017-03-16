package pattern.facade;

public class DBReportGeneratorFactory {

    public static DBReportGenerator getReportGenerator(DBType dbType) {
        switch (dbType) {
            case MySQL:
                return new MySQLReportGenerator();
            case Oracle:
                return new OracleReportGenerator();
            default:
                throw new IllegalArgumentException("not a valid db type :" + dbType);
        }
    }
}
