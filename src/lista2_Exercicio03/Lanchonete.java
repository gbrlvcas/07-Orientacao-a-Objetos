package lista2_Exercicio03;

import javax.swing.JOptionPane;

public class Lanchonete {
		
	//Atribui��es
	int pedido;
	double valorPedido = 0;
	
	
	
	//M�todo - Solicitar pedidos
	public void pedido() {
		
	//Variaveis
	boolean erroPedido = false;
	
	String[] produtos = {"**** Escolha o seu pedido ****\n\n",
						"1)Hamb�rguer + Suco de Laranja  -  R$ 5,00",
						"2)Sandu�che natural + Suco de Uva  -  R$ 4,50",
						"3)Prato do dia  -  R$ 8,00",
						"4)Pizza  -  R$ 12,00",
						"5)Lasanha  -  R$ 16,50",
						"6)P�o de Queijo  -  R$ 1,00",
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

	//M�todo - Calcular pedidos
	public void somaPedido() {
		
		if(pedido == 1) {
			valorPedido+= 5.00;
		}
		
	}
}
