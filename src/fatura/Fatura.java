package fatura;

import java.util.ArrayList;
import java.util.Date;


import formaPagamento.FormaPagamento;
import pagamento.Pagamento;

public class Fatura {
	private String cliente;
	private Date data;
	private double valorTotal;
	
	public Fatura(String cliente,Date data,double valorTotal) {
		this.cliente=cliente;
		this.data=data;
		this.valorTotal=valorTotal;
	}
	private ArrayList<Pagamento> convertToPagamentos(ArrayList<FormaPagamento> fps){
		ArrayList<Pagamento> ps=new ArrayList<Pagamento>();
		for(FormaPagamento fp : fps) {
			ps.add(new Pagamento(fp.data,fp.valor,fp.tipo));
		}
	    return ps;
	}
	public String faturaEstáPaga(ArrayList<FormaPagamento> FormasDePagamento) {
		ArrayList<Pagamento> pagamentos=convertToPagamentos(FormasDePagamento);
		return "incompleto";
	}

}
