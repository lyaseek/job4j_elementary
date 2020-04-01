package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        System.out.println(report.generate("name", "body"));
        HtmlReport htmlReport = new HtmlReport();
        System.out.println(htmlReport.generate("name", "body"));
    }
}
