package exemplo03;

import javax.swing.JOptionPane;

public class Carro {

	
	//Atributos
	String[] nomeCarro = new String[5];
	double[] valorCarro = new double[5];
	
	//Método para retornar a posição livre do vetor
	public int posicaoLivre() {
		
		//Variavel
		int posicao = 0;
		
		//Laço, isso não é um laço
		for(int i=0 ; i < nomeCarro.length; i++){
			
			//Condicional
			if(nomeCarro[i] == null){
				posicao = i;
				break;
			}
		}
		
		return posicao;
	}
	
	//Realizar perguntas
	public void perguntas() {
		
		//Obter a posição
		int posicao = posicaoLivre();
		
		nomeCarro[posicao] = JOptionPane.showInputDialog("Informe o carro");
		valorCarro[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro"));
		
	}
	
	//Laço
	public void laco () {
		
		//Variavel
		int continuar =  0;
		
		//Laço
		do{
			perguntas();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?","",0);
			
		}while(continuar == 0);
		
		//Ordenar e exibir
		ordenar();
		exibir();
		
	}
	
	//Método de ordenação
	public void ordenar(){
		
		//Variaveis
		String nomeMaiorCarro;
		double valorMaiorCarro;
		
		//Laço principal
		for(int i1 = 0 ; i1 < nomeCarro.length - 1 ; i1++){
			
			//Laço secundario
			for(int i2 = i1+1 ; i2 < nomeCarro.length ; i2++){
				
				//Condicional
				if(valorCarro[i2] > valorCarro[i1]){
					nomeMaiorCarro = nomeCarro[i1];
					nomeCarro[i1] = nomeCarro[i2];
					nomeCarro[i2] = nomeMaiorCarro;
					
					valorMaiorCarro = valorCarro[i1];
					valorCarro[i1] = valorCarro[i2];
					valorCarro[i2] = valorMaiorCarro;
					
					
				}
			}
		}
	}

	//Método para exibir os dados e seus valores ordenados
	public void exibir() {
		
		//Variável contendo o texto que será exibido
		String msg= "*****CARROS CADASTRADOS*****";

		//Laço
		for(int i=0 ; i<nomeCarro.length ; i++){
			
			if(nomeCarro[i] != null){
				msg +="\n"+nomeCarro[i]+" "+valorCarro[i];
			}
		}
		
		//Exibir Mensagem
		JOptionPane.showMessageDialog(null, msg);
	}
}
