package lista2_Exercicio05;


import javax.swing.JOptionPane;

public class Papelaria {
	
	//Atribuições
	String produto;
	double valorProduto = 0;
	
	//Método - Nome do produto
	public void produtoNome(){
		
		//Variaveis
		String validaNome;
		boolean erroNome = false;
		
		//Solicitando nome do produto
		do {
			erroNome = false;
			
				validaNome = JOptionPane.showInputDialog("Digite o nome do produto");
				
					if(validaNome.equals("")) {
						JOptionPane.showMessageDialog(null, "Não deixe este campo em branco");
						erroNome = true;
					}else {
						produto = validaNome;
					}
					
	}while(erroNome == true);
		
}
	
	//Método - Valor do produto
	public void produtoValor() {
		
		//Solicitando o valor do produto
		
			valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
						
	}
	
	//Método - Mensagem e resultado
	public void mensagemResultado() {
		
		String mensagem = "**** Tabela de descontos ****";
			for(int tabela = 1 ; tabela < 11 ; tabela++) {
		       mensagem+="\n";
		       mensagem+= tabela+" x R$"+(valorProduto - (valorProduto * (tabela * 0.05)))+" = R$"+(valorProduto - (valorProduto * (tabela * 0.05))) * tabela;
		       
			}
			
			//Mostrando mensagem
			JOptionPane.showMessageDialog(null, mensagem);
	}
	
	//Método - Laço e Programa
	public void ProgramaPapelaria(){
		//Variaveis
		int continuar = 0;
		
	do{
		produtoNome();
		produtoValor();
		mensagemResultado();
		
		//Peguntando se cliente quer calcular outro produto
		continuar = JOptionPane.showConfirmDialog(null, "Deseja ver outros descontos?","",0);
				
	}while(continuar == 0);
	
	
	}
}
