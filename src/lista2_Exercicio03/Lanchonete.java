package lista2_Exercicio03;

import javax.swing.JOptionPane;

public class Lanchonete {
		
	//Atribuições
	int pedido;
	double valorPedido = 0;
	double valorPagamento = 0;
	double trocoPedido = 0;
	
	
	
	//Método - Solicitar pedidos
	public void pedido() {
		
	//Variaveis
	boolean erroPedido = false;
	
	String[] produtos = {"**** Escolha o seu pedido ****\n\n",
						"1)Hambúrguer + Suco de Laranja  -  R$ 5,00",
						"2)Sanduíche natural + Suco de Uva  -  R$ 4,50",
						"3)Prato do dia  -  R$ 8,00",
						"4)Pizza  -  R$ 12,00",
						"5)Lasanha  -  R$ 16,50",
						"6)Pão de Queijo  -  R$ 1,00",
						"7)Bolo  -  R$ 2,50"};
	do {
		erroPedido = false;
		
	pedido = Integer.parseInt(JOptionPane.showInputDialog(produtos));
		if(pedido < 1 || pedido > 7) {
			JOptionPane.showMessageDialog(null, "Digite um pedido entre 1 e 7");
			erroPedido = true;
		}
	}while(erroPedido == true);
	}

	//Método - Calcular pedidos
	public void somaPedido() {
		
		if(pedido == 1) {
			valorPedido+= 5.00;
		}else if(pedido == 2) {
			valorPedido+= 4.50;
		}else if(pedido == 3) {
			valorPedido+= 8.00;
		}else if(pedido == 4) {
			valorPedido+= 12;
		}else if(pedido == 5) {
			valorPedido+= 16.50;
		}else if(pedido == 6) {
			valorPedido+= 1.00;
		}else if(pedido == 7) {
			valorPedido+= 2.50;
		}
		
	}
	
	//Método - Nota fiscal (Este método esta inserido na validação de valor)
	public String notaFiscal() {
		
		//Estrutura - Nota Fiscal
		String notafiscal = "**** Dados do seu pedido ****";
			   notafiscal+= "\n\nO seu pedido custou: R$"+valorPedido;
			   notafiscal+= "\nDigite o valor do pagamento";
			   
		return notafiscal;
		
	}
	
	//Método - Validação de valor
	public void validaValor() {
		
		//Variaveis
		boolean erroValor = false;
	
		do {
			erroValor = false;
		
		valorPagamento = Double.parseDouble(JOptionPane.showInputDialog(notaFiscal()));
		
		if(valorPagamento < valorPedido) {
			JOptionPane.showMessageDialog(null, "O valor a pagar é menor que o valor do pedido");
			erroValor = true;
		}
		
		}while(erroValor == true);
	}
	
	//Método - Troco do cliente
	public void trocoCliente() {
		
		trocoPedido = valorPagamento - valorPedido;
		
		JOptionPane.showMessageDialog(null,"O seu troco é de R$: "+trocoPedido);
	}
	
	//Método - Laço e Programa
	public void ProgramaLanchonete() {
		
		//Variaveis
		int continuarPedido;
		boolean novoPedido = false;
		
		do {
			 novoPedido = false;
			 
				pedido();
				somaPedido();
				
			continuarPedido = JOptionPane.showConfirmDialog(null, "Deseja fazer mais algum pedido?","",0);
				if(continuarPedido == 0) {
					novoPedido = true;
				}
				
		}while(novoPedido == true);
		
				notaFiscal();
				validaValor();
				trocoCliente();
	}
}
