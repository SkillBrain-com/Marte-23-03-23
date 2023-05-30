package sanduCristianMentor.OOPExcerises;

public class Report {


    public String generateReport() {
        return "CSV";
    }

    public Object generateReport(String method) {
        return "XLSX";
    }

    public Number generateReport(int number) {
        return 10;
    }


}
