package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		// TODO Auto-generated method stub
		System.out.println("Enviar email do pedido!");
	}
}
