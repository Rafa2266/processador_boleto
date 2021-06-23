package boleto;

import java.util.Date;

import formaPagamento.FormaPagamento;

public class Boleto extends FormaPagamento {
public String codigo;

public Boleto( String codigo,Date data, double valor) {
    super(data, valor,"boleto");
	this.codigo=codigo;
	
}

}

