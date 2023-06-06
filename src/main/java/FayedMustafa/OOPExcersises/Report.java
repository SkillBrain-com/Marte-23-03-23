package FayedMustafa.OOPExcersises;

public class Report {

    public String generateReport(){
        return "CSV";
    }

    public Object generateReport(String method){
        return "XLSX";
    }

    public Integer generateReport(int number){
        return 10;
    }
}
