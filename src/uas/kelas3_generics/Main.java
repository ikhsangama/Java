package uas.kelas3_generics;

/*
class  Document{}
class  TextDocument{}
class  WordDocument extends  Document{}
class  PDFDocument extends  Document{}
class  Report<T  extends  Document>{}

class  ReportUtil{
    public  void  printReport(.........  X){
    }
}
*/


public class Main {

    public static void main(String[] args) {
        /*1*/
//        Report<PDFDocument> rp1 = new Report<>();

        /*2
        * Hanya bisa menerima turunan dari Document,
        * Atau kelas TextDocument dibuat extends Document
        * */
//        Report<TextDocument> rp2 = new Report<>();

        /*3
        * Salah, TextDocument bukan turunan dari Document
        * */

        /*4*/
//        Report <PDFDocument> r4 = new Report<>();
//        ReportUtil reportUtil = new ReportUtil();
//        reportUtil.printReport(r4);

        /*5*/
//        Report <WordDocument> r5 = new Report<>();
//        ReportUtil2 reportUtil = new ReportUtil2();
//        reportUtil.printReport(new Report<>());

    }
}
