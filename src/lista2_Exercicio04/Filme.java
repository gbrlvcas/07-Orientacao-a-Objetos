package lista2_Exercicio04;

import javax.swing.JOptionPane;

public class Filme {
	
	//Atributos
	int participantes = 0, excelente = 0, otimo = 0, bom = 0, regular = 0, ruim = 0;
	int avaliar = 0;

	//M�todo - Solicitar idade e Validar
	public Integer idadeParticipante() {
		
		//Variaveis
		int idade = 0;
		boolean erroIdade = false;
		
		//Idade (Pergunta e Valida��o)
		do {
			erroIdade = false;
			
			//Validador - Caso cliente coloque um caractere
				try {
					
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
				
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Digite apenas n�meros");
					erroIdade = true;
				}
				
			//Validador - Caso cliente coloque uma idade abaixo de 0 ou acima de 100
				if(erroIdade = false) {
					if(idade < 1 || idade > 100) {
						JOptionPane.showMessageDialog(null, "Idade invalida");
						erroIdade = true;
					}
				}
				
		}while(erroIdade == true);
		
		return idade;
	}
	
	//M�todo - Contador de idade
	
	//M�todo - Menu de avalia��o
	public String menuAvaliacao() {
		
		//Variveis
		String menu = "**** Menu de avalia��o ****\n - Avalie o filme Alice no Pais das Maravilhas";
			   menu+= "\n\n1)Excelente";
			   menu+= "\n2)�timo";
			   menu+= "\n3)Bom";
			   menu+= "\n4)Regular";
			   menu+= "\n5)Ruim";
		
		return menu;
	}
	
	//M�todo - Escolha e Valida��o
	public void avaliarFilme() {
		
		//Variaveis
		boolean erroAvaliacao = false;
		
		
		//Avalia��o (Pergunta e Valida��o)
		
		do {
			erroAvaliacao = false;
			
			//Validador - Caso cliente coloque um caractere
			try {
				
				//Solicitar avaliacao cliente
				avaliar = Integer.parseInt(JOptionPane.showInputDialog(menuAvaliacao()));
			
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Digite apenas n�meros");
				erroAvaliacao = true;
			}
			//Validador - Caso cliente coloque um n�mero diferente do menu de avalia��o
			if(erroAvaliacao == false) {
				if(avaliar < 1 || avaliar > 5) {
					erroAvaliacao = true;
				}
			}
			
		}while(erroAvaliacao == true);
	}
	
	//M�todo - Contador avaliacao
	public void contadorAvaliacao() {
		
		if(avaliar == 1) {
			excelente++;
		}else if(avaliar == 2) {
			otimo++;
		}else if(avaliar == 3) {
			bom++;
		}else if(avaliar == 4) {
			regular++;
		}else if(avaliar == 5) {
			ruim++;
		}
		
	}
}
