package latihanUTS.nasywa.tour;

public class NaPay {
    NaTic	tic;
    int	saldo;
    void	topUp(int	t){
        this.saldo	=	t;
        System.out.println("Terimakasih	telah melakukan TopUp NaPay. Saldo Anda= "+this.saldo);
    }
    void	bayarTic(NaTic	t,	int	b){
        this.tic	=	t;
        this.tic.bayarTiket(b);
    }
    void	bayarTic(NaTic	t){
        this.tic	=	t;
        if	(this.saldo	>	this.tic.biaya){
            this.tic.bayarTiket(this.tic.biaya);
            this.saldo	=	this.saldo	- this.tic.biaya;
            System.out.println("Terimakasih	telah melakukan pembayaran via NaPay. Sisa Saldo= "+this.saldo);
        }	else	{
            System.out.println("Maaf Saldo Anda	Tidak Mencukupi untuk melakukan	pembayaran via NaPay");
        }
    }
}
