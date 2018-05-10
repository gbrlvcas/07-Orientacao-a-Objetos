package lista2_Exercicio02;

import javax.swing.JOptionPane;

public class Jogadores {

	// ======================= Atributos ====================== \\
	
		//Nomes
	String validaNome = "";
	boolean erroNome = false;;
	String nome = "";
	
		//Idades
	int validaIdade;
	boolean erroIdade = false;
	int idade;
	
		//Peso
	int validaPeso;
	boolean erroPeso = false;
	int peso;
		
		//Altura
	String validaAltura;
	boolean erroAltura = false;
	double altura;
	
		//Contador de jogadores
	int contaJogadores = 0;
	
		//Jogador mais alto
	String nomeAlto = "";
	double alturaAlto = 0;
	
		//Jogador mais velho
	String nomeVelho = "";
	double idadeVelho = 0;
	
		//Jogador mais pesado
	String nomePesado = "";
	double pesoPesado = 0;
	
		//Média
	double mediaAltura = 0;
	
	
// ======================= Métodos ====================== \\
	
	//Método de perguntas
	public void perguntas(){
		
		
			//Nomes - Validação e Atribuição
			
			do{
				erroNome = false;
				
			//Validação
			validaNome = JOptionPane.showInputDialog("Digite o seu nome");
				if(validaNome.equals("")){
					JOptionPane.showMessageDialog(null, "Não deixe este campo em branco");
					erroNome = true;
				}
				
				//Atribuição
				if(erroNome == false){
					nome = validaNome;
					contaJogadores++;
				}
				
			}while(erroNome == true);
				
			
			//Idade - Validação e Atribuição
				
			do{
				erroIdade = false;
				
				//Validação
				try{
					validaIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Digite apenas números");
					erroIdade = true;
				}
				
				//Atribuição
				if(erroIdade == false){
					idade = validaIdade;
				}
				
			}while(erroIdade == true);
			
			
			//Peso - Validação e Atribuição
			
			do{
				erroPeso = false;
				
				//Validação
				try{
					validaPeso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso"));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Digite apenas números");
					erroPeso = true;
				}
				
				//Atribuição
				if(erroPeso == false){
					peso = validaPeso;
				}
				
		}while(erroPeso == true);
		
			//Altura - Validação e Atribuição
			
			do{
				erroAltura = false;
				
				//Validação
				validaAltura = JOptionPane.showInputDialog("Digite a sua altura");
					if(validaAltura.indexOf(".") == -1){
						JOptionPane.showMessageDialog(null, "Digite a altura no formato #.##");
						erroAltura = true;
					}else{
					
						try{
							
						altura = Double.parseDouble(validaAltura);
							
						}catch(Exception e){
							JOptionPane.showMessageDialog(null, "Digite apenas números\nEx: 1 ou 1.70 (Use apenas .)");
							erroAltura = true;
						
					}
				
				}
				
			}while(erroAltura == true);
			
	}
	
	
	//Método - Jogador mais alto
	public void jogadorAlto(){
		
		if(altura > alturaAlto){
			alturaAlto = altura;
			nomeAlto = nome;
		}
}

	
	//Método - Jogador mais velho
	public void jogadorVelho(){
		
		if(idade > idadeVelho){
			idadeVelho = idade;
			nomeVelho = nome;
		}
	}
	
	
	//Método - Jogador mais pesado
	public void jogadorPesado(){
		
		if(peso > pesoPesado){
			pesoPesado = peso;
			nomePesado = nome;
		}
	}
	
	
	//Método - Média das alturas
	public double mediaJogadores(){
		
	mediaAltura = mediaAltura + altura;
	
		//Variavel
	double media = mediaAltura / contaJogadores;
	
	return media;
	
	
	}
	
	
	//Método - Exibição
	public void exibicao(){
		
		String mensagem = "**** Resultado dos cadastros ****";
			   mensagem+= "\n\nQuantidade de jogadores: "+contaJogadores;
			   mensagem+= "\n\nJogador mais alto";
			   mensagem+= "\nNome: "+nomeAlto;
			   mensagem+= "\nAltura: "+alturaAlto;;
			   mensagem+= "\n\nJogador mais Velho";
			   mensagem+= "\nNome: "+nomeVelho;
			   mensagem+= "\nIdade: "+idadeVelho;
			   mensagem+= "\n\nJogador mais pesado";
			   mensagem+= "\nNome: "+nomePesado;
			   mensagem+= "\nPeso: "+pesoPesado;
			   mensagem+=" \n\nMédia de altura: "+String.format("%.2f",mediaJogadores());
			   
			   JOptionPane.showMessageDialog(null, mensagem);
		
	}
	
	
	//Método - Programa (Laço)
	public void ProgramaJogadores(){
		
		//Variavel
		int continuar = 0;
		
		//Aplicando o laço
		do{
			perguntas();
			jogadorAlto();
			jogadorVelho();
			jogadorPesado();
			mediaJogadores();
		continuar = JOptionPane.showConfirmDialog(null, "Deseja fazer outro cadastro?","",0);
		}while(continuar == 0);
		
		exibicao();
		
		
	}
}