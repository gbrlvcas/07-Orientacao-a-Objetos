package lista2_Exercicio06;


import javax.swing.JOptionPane;

public class Avaliacao {

	//Atribui��es
	int nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
	
	//M�todo - Perguntas e Valida��o
	public void perguntas() {
		
		//Variaveis
		String nome = "";
		String menuSexo = "**** Escolha seu sexo ****";
			   menuSexo+= "\n1)Masculino";
			   menuSexo+= "\n2)Feminino";
		int sexo = 0;
		
		boolean erroPerguntas = false;
		
		
		//Fazendo perguntar e validar
			
			//Pergunta e valida��o [NOME]
		do {
			erroPerguntas = false;
			
				nome = JOptionPane.showInputDialog("Digite o seu nome");
				
					if(nome.equals("")) {
						JOptionPane.showMessageDialog(null, "N�o deixe este campo em branco");
						erroPerguntas = true;
						
					}
					
		}while(erroPerguntas == true);
		
		
			//Pergunta e valida��o [SEXO]
		do {
			erroPerguntas = false;
			
			try {
				sexo = Integer.parseInt(JOptionPane.showInputDialog(menuSexo));
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Digite apenas n�meros");
				erroPerguntas = true;
			}
			
			if(erroPerguntas = false) {
				if(sexo < 1 || sexo > 2) {
					JOptionPane.showMessageDialog(null, "Digite apenas 1 ou 2");
					erroPerguntas = true;
				}
			}
			
		}while(erroPerguntas == true);
		
		do {
			nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua 1� nota"));
		}while(erroPerguntas == true);
		
		
		
	}
}
	

