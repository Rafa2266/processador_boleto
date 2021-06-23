package testePagarFatura;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;
import formaPagamento.FormaPagamento;

import java.util.ArrayList;

@DisplayName("Classe para teste do c·lculo do pagamento da fatura")
public class TestPagarFatura {
	private Fatura fatura;
	private Boleto boleto1;
	private Boleto boleto2;
	private Boleto boleto3;
	private Boleto boleto4;
	private ArrayList<FormaPagamento> fps;
	@BeforeEach
	public void inicializa() {
		 fatura=new Fatura("Rafael",new Date(),3000);
		 boleto1=new Boleto("849759384",new Date(),1500);
		 boleto2=new Boleto("649774242",new Date(),500);
		 boleto3=new Boleto("734638584",new Date(),1000);
		 boleto4=new Boleto("913661184",new Date(),600);
		 fps= new ArrayList<FormaPagamento>();
	}
	@DisplayName("Testa se a fatura È paga quando È recebido boletos no valor exato")
	@Test
	public void testPagamentoValorExato() {
			fps.add(boleto1);
			fps.add(boleto2);
			fps.add(boleto3);
			Assertions.assertEquals("foi pago",fatura.faturaEst·Paga(fps));
	}
	@DisplayName("Testa se a fatura È paga quando È recebido boletos que representam um valor maior")
	@Test
	public void testPagamentoValorAcima() {
			fps.add(boleto1);
			fps.add(boleto2);
			fps.add(boleto3);
			fps.add(boleto4);
			Assertions.assertEquals("foi pago",fatura.faturaEst·Paga(fps));
	}
	@DisplayName("Testa se a fatura n„o È paga quando È recebido boletos que representam um valor menor")
	@Test
	public void testPagamentoValorAbaixo() {
			fps.add(boleto1);
			fps.add(boleto2);
			Assertions.assertEquals("n„o foi pago",fatura.faturaEst·Paga(fps));
	}

}
