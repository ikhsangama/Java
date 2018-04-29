package latihanUTS.nasywa.tour;

public class MPay {
    public	static	void	main(String[]	args){
        NaTic	xx	=	new	NaTic("Semarang",	"Jakarta",	"21	Maret	2018",
                "Ekonomi",1,1000000);
        xx.bayarTiket(100000);
        NaPay	yy	=	new	NaPay();
        yy.topUp(2000000);
        yy.bayarTic(xx,500000);
        yy.bayarTic(xx);
    }
}
