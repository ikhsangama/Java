package kelas3_generics;

/*5*/
public class ReportUtil2 {

    Report rep;

    public void printReport(Report <? super WordDocument> r){
        this.rep = r;
        System.out.println(rep);
    }

}
