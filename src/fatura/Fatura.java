package fatura;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import formaPagamento.FormaPagamento;
import pagamento.Pagamento;

public class Fatura {
	private ArrayList<Pagamento> pagamentos;
	private String cliente;
	private Date data;
	private double valorTotal;
	
	public Fatura(String cliente,Date data,double valorTotal) {
		this.cliente=cliente;
		this.data=data;
		this.valorTotal=valorTotal;
		this.pagamentos=new ArrayList<Pagamento>();
	}
	private ArrayList<Pagamento> convertToPagamento(ArrayList<FormaPagamento> fps){
		ArrayList<Pagamento> ps=new ArrayList<Pagamento>();
		for(FormaPagamento fp : fps) {
			ps.add(new Pagamento(fp.data,fp.valor,fp.tipo));
		}
	    return ps;
	}
	public String faturaEst·Paga(ArrayList<FormaPagamento> FormasDePagamento) {
		this.pagamentos=convertToPagamento(FormasDePagamento);
		return "incompleto";
	}

}
