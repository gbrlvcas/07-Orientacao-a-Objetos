package lista2_Exercicio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Atribui��es
		int[] contador = new int[10];
		String produto;
		
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

}
	
}
