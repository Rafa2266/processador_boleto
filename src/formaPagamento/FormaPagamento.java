package formaPagamento;

import java.util.Date;

public class FormaPagamento {
	public String tipo;
	public Date data;
	public double valor;
	
	public FormaPagamento( Date data, double valor,String tipo) {
	this.data=data;
	this.valor=valor;
	this.tipo=tipo;
    }
}


