package lista2_Exercicio06;

import javax.swing.JOptionPane;

public class Avaliacao {

	//Atribui��es
	String nome = "", situacao = "";
	double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;
	int contaAlunos = 0, sexo = 0, sexoMasc = 0, sexoFemi = 0;
	int reprovado = 0, recuperacao = 0, satisfatorio = 0, bom = 0, otimo = 0, parabens = 0;

	//M�todo - Perguntas e Valida��o
	public void perguntas() {
		
		//Variaveis
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
		
		//Pergunta e valida��o [Nota 1]
		do {
			erroPerguntas = false;
			
			try {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 1� nota"));
			
			}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Digite apenas n�meros");
				erroPerguntas = true;
			}
			
			if(erroPerguntas == false) {
				if(nota1 < 0 || nota1 > 10) {
					JOptionPane.showMessageDialog(null, "Digite a nota entre 0 e 10");
					erroPerguntas = true;
				}
			}
			
		}while(erroPerguntas == true);
		
		//Pergunta e valida��o [Nota 2]
				do {
					erroPerguntas = false;
					
					try {
					nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 2� nota"));
					
					}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Digite apenas n�meros");
						erroPerguntas = true;
					}
					
					if(erroPerguntas == false) {
						if(nota2 < 0 || nota2 > 10) {
							JOptionPane.showMessageDialog(null, "Digite a nota entre 0 e 10");
							erroPerguntas = true;
						}
					}
					
				}while(erroPerguntas == true);
				
				//Pergunta e valida��o [Nota 3]
				do {
					erroPerguntas = false;
					
					try {
					nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 3� nota"));
					
					}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Digite apenas n�meros");
						erroPerguntas = true;
					}
					
					if(erroPerguntas == false) {
						if(nota3 < 0 || nota3 > 10) {
							JOptionPane.showMessageDialog(null, "Digite a nota entre 0 e 10");
							erroPerguntas = true;
						}
					}
					
				}while(erroPerguntas == true);
				
				//Pergunta e valida��o [Nota 4]
				do {
					erroPerguntas = false;
					
					try {
					nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 4� nota"));
					
					}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Digite apenas n�meros");
						erroPerguntas = true;
					}
					
					if(erroPerguntas == false) {
						if(nota4 < 0 || nota4 > 10) {
							JOptionPane.showMessageDialog(null, "Digite a nota entre 0 e 10");
							erroPerguntas = true;
						}
					}
					
				}while(erroPerguntas == true);
		
		
		
	}
	
	//M�todo - Contador de Alunos e Sexo
	public void contadorSexo() {
		if(sexo == 1) {
			contaAlunos++;
			sexoMasc++;
		}else if(sexo == 2) {
			contaAlunos++;
			sexoFemi++;
			
			}
		}
	
	//M�todo - Calculo da m�dia
	public double mediaAluno() {
		
		media = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		return media;
	}
	
	//M�todo - Contador de situa��es
	public void contadorSituacao() {
		
		if(media < 5) {
			reprovado++;
			situacao = "Reprovado";
		}else if(media < 7) {
			recuperacao++;
			situacao = "Recupera��o";
		}else if(media < 8) {
			satisfatorio++;
			situacao = "Satisfat�rio";
		}else if(media < 9) {
			bom++;
			situacao = "Bom";
		}else if(media < 10) {
			otimo++;
			situacao = "Otimo";
		}else if(media == 10) {
			parabens++;
			situacao = "Parab�ns";
		}
	}
	
	//M�todo - Situa��o do aluno
	public void situacaoAluno() {
		
		//Variaveis
		String resultadoAluno;
		
		//Mensagem
		resultadoAluno = "**** Avalia��o da m�dia ****";
		resultadoAluno+= "\n\nOl�, "+nome;
		resultadoAluno+= "\nA sua m�dia �: "+media;
		resultadoAluno+= "\n A sua situa��o �: "+situacao;
		
		//Mostrando a mensagem
		JOptionPane.showMessageDialog(null, resultadoAluno);
	}
	
	//M�todo - Situa��o geral
	public void situacaoGeral() {
		
		//Variaveis
		String resultadoGeral;
		
		//Mensagem
		resultadoGeral = "**** Resultado geral ****";
		resultadoGeral+= "\n\n - Quantidade e Percentual por sexo";
		resultadoGeral+= "\nHomens: "+(sexoMasc / contaAlunos) * 100;
		resultadoGeral+= "\nMulheres: "+(sexoFemi / contaAlunos) * 100;
		resultadoGeral+= "\n\n - Quantidade Percentual por situa��o";
		resultadoGeral+= "\nMedia 10: "+parabens+" alunos - "+(parabens / contaAlunos) * 100+"%";
		resultadoGeral+= "\nMedia 9: "+otimo+" alunos - "+(otimo / contaAlunos) * 100+"%";
		resultadoGeral+= "\nMedia 8: "+bom+" alunos - "+(bom / contaAlunos) * 100+"%";
		resultadoGeral+= "\nMedia 7: "+satisfatorio+" alunos - "+(satisfatorio / contaAlunos) * 100+"%";
		resultadoGeral+= "\nMedia entre 6 e 5: "+recuperacao+" alunos - "+(recuperacao / contaAlunos) * 100+"%";
		resultadoGeral+= "\nMedia abaixo de 5: "+reprovado+" alunos - "+(reprovado / contaAlunos) * 100+"%";
	}
}	
	
	

