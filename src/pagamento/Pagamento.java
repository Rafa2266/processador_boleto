package pagamento;

import java.util.Date;

public class Pagamento {
	private String tipo;
	private Date data;
	private double valor;
    
	public Pagamento(Date data, double valor,String tipo) {
		this.data=data;
		this.valor=valor;
		this.tipo=tipo;
	    }
}
