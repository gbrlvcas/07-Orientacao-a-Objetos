package lista2_Exercicio05;

import javax.swing.JOptionPane;

public class Papelaria {
	
	//Atribui��es
	String produto;
	double valorProduto = 0;
	
	//M�todo - Nome do produto
	public void produtoNome(){
		
		//Variaveis
		String validaNome;
		boolean erroNome = false;
		
		//Solicitando nome do produto
		do {
			erroNome = false;
			
				validaNome = JOptionPane.showInputDialog("Digite o nome do produto");
				
					if(validaNome.equals("")) {
						JOptionPane.showMessageDialog(null, "N�o deixe este campo em branco");
						erroNome = true;
					}else {
						produto = validaNome;
					}
					
	}while(erroNome == true);
		
}
	
	//M�todo - Valor do produto
	public void produtoValor() {
		
		//Variaveis
		boolean erroValor = false;
		
		//Solicitando o valor do produto
		
			valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
						
	}
	
	//M�todo - Mensagem e resultado
	public String mensagemResultado() {
		
		String mensagem = "**** Tabela de descontos ****";
			for(int tabela = 1 ; tabela < 10 ; tabela++) {
		       mensagem+="\n";
		       mensagem+= (tabela+1)+" x R$"+valorProduto -(valorProduto * (tabela * 0.05))+" = R$"+(valorProduto * (tabela * 0.05)) * tabela;
		       
			}
	}
}	

