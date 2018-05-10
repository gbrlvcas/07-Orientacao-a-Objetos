package lista2_Exercicio04;

import javax.swing.JOptionPane;

public class Filme {
	
	//Atributos
	int participantes = 1, excelente = 0, otimo = 0, bom = 0, regular = 0, ruim = 0;
	int avaliar = 0;
	int idade = 0, crianca = 0, adolescente = 0, adulto = 0;

	//Método - Solicitar idade e Validar
	public void idadeParticipante() {
		
		//Variaveis
		boolean erroIdade = false;
		
		//Idade (Pergunta e Validação)
		do {
			erroIdade = false;
			
			//Validador - Caso cliente coloque um caractere
				try {
					
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
				
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Digite apenas números");
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
		

	}
	
	//Método - Contador de idade
	public void contadorIdade() {
		
		if(idade > 0 && idade < 10) {
			crianca++;
		}else if(idade < 18) {
			adolescente++;
		}else if(idade >= 18) {
			adulto++;
		}
	}
	
	//Método - Menu de avaliação
	public String menuAvaliacao() {
		
		//Variveis
		String menu = "**** Menu de avaliação ****\n - Avalie o filme Alice no Pais das Maravilhas";
			   menu+= "\n\n1)Excelente";
			   menu+= "\n2)Ótimo";
			   menu+= "\n3)Bom";
			   menu+= "\n4)Regular";
			   menu+= "\n5)Ruim";
		
		return menu;
	}
	
	//Método - Escolha e Validação
	public void avaliarFilme() {
		
		//Variaveis
		boolean erroAvaliacao = false;
		
		
		//Avaliação (Pergunta e Validação)
		
		do {
			erroAvaliacao = false;
			
			//Validador - Caso cliente coloque um caractere
			try {
				
				//Solicitar avaliacao cliente
				avaliar = Integer.parseInt(JOptionPane.showInputDialog(menuAvaliacao()));
			
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Digite apenas números");
				erroAvaliacao = true;
			}
			//Validador - Caso cliente coloque um número diferente do menu de avaliação
			if(erroAvaliacao == false) {
				if(avaliar < 1 || avaliar > 5) {
					erroAvaliacao = true;
				}
			}
			
		}while(erroAvaliacao == true);
	}
	
	//Método - Contador avaliacao
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
	
	//Método - Mensagem do resultado
	public String mensagemResultado() {
		
		String msgResultado = "**** Resultado da avaliacao";
			   msgResultado+="\n - Percentual de votos";
			   msgResultado+="\n   Excelente: "+excelente+" votos - Percentual: "+(excelente / participantes) * 100+"%";
			   msgResultado+="\n   Excelente: "+otimo+" votos - Percentual: "+(otimo / participantes) * 100+"%";
			   msgResultado+="\n   Excelente: "+bom+" votos - Percentual: "+(bom / participantes) * 100+"%";
			   msgResultado+="\n   Excelente: "+regular+" votos - Percentual: "+(regular / participantes) * 100+"%";
			   msgResultado+="\n   Excelente: "+ruim+" votos - Percentual: "+(ruim / participantes) * 100+"%";
			   msgResultado+="\n\n - Quantidade por faixa etaria";
			   msgResultado+="\n   Criança: "+crianca+" crianças";
			   msgResultado+="\n   Adolescente: "+adolescente+" adolescentes";
			   msgResultado+="\n   Adulto: "+adulto+" adultos";
			   
			   JOptionPane.showMessageDialog(null, msgResultado);
			   
			   return msgResultado;
	}
	
	//Método - Laço e Programa
	public void ProgramaAvaliacao() {
		
		//Variaveis
		int continuarAvaliacao;
		boolean sairAvaliacao = true;
		
		do {
			sairAvaliacao = true;
				
				idadeParticipante();
				contadorIdade();
				avaliarFilme();
				contadorAvaliacao();
				
			continuarAvaliacao = JOptionPane.showConfirmDialog(null, "Mais alguem deseja avaliar?","",0);
			
				if(continuarAvaliacao == 0) {
					sairAvaliacao = false;
					
				}
		}while(sairAvaliacao == false);
		
		//Mostrando a mensagem
		mensagemResultado();
	}
}
