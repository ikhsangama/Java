package kelas3_generics;

/*4*/
public class ReportUtil{

    Report rep;

    public void printReport(Report <? extends Document> r){
        this.rep = r;
        System.out.println(rep);
    }

}