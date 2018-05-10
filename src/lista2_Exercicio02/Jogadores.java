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
	
		//M�dia
	double mediaAltura = 0;
	
	
// ======================= M�todos ====================== \\
	
	//M�todo de perguntas
	public void perguntas(){
		
		
			//Nomes - Valida��o e Atribui��o
			
			do{
				erroNome = false;
				
			//Valida��o
			validaNome = JOptionPane.showInputDialog("Digite o seu nome");
				if(validaNome.equals("")){
					JOptionPane.showMessageDialog(null, "N�o deixe este campo em branco");
					erroNome = true;
				}
				
				//Atribui��o
				if(erroNome == false){
					nome = validaNome;
					contaJogadores++;
				}
				
			}while(erroNome == true);
				
			
			//Idade - Valida��o e Atribui��o
				
			do{
				erroIdade = false;
				
				//Valida��o
				try{
					validaIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Digite apenas n�meros");
					erroIdade = true;
				}
				
				//Atribui��o
				if(erroIdade == false){
					idade = validaIdade;
				}
				
			}while(erroIdade == true);
			
			
			//Peso - Valida��o e Atribui��o
			
			do{
				erroPeso = false;
				
				//Valida��o
				try{
					validaPeso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso"));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Digite apenas n�meros");
					erroPeso = true;
				}
				
				//Atribui��o
				if(erroPeso == false){
					peso = validaPeso;
				}
				
		}while(erroPeso == true);
		
			//Altura - Valida��o e Atribui��o
			
			do{
				erroAltura = false;
				
				//Valida��o
				validaAltura = JOptionPane.showInputDialog("Digite a sua altura");
					if(validaAltura.indexOf(".") == -1){
						JOptionPane.showMessageDialog(null, "Digite a altura no formato #.##");
						erroAltura = true;
					}else{
					
						try{
							
						altura = Double.parseDouble(validaAltura);
							
						}catch(Exception e){
							JOptionPane.showMessageDialog(null, "Digite apenas n�meros\nEx: 1 ou 1.70 (Use apenas .)");
							erroAltura = true;
						
					}
				
				}
				
			}while(erroAltura == true);
			
	}
	
	
	//M�todo - Jogador mais alto
	public void jogadorAlto(){
		
		if(altura > alturaAlto){
			alturaAlto = altura;
			nomeAlto = nome;
		}
}

	
	//M�todo - Jogador mais velho
	public void jogadorVelho(){
		
		if(idade > idadeVelho){
			idadeVelho = idade;
			nomeVelho = nome;
		}
	}
	
	
	//M�todo - Jogador mais pesado
	public void jogadorPesado(){
		
		if(peso > pesoPesado){
			pesoPesado = peso;
			nomePesado = nome;
		}
	}
	
	
	//M�todo - M�dia das alturas
	public double mediaJogadores(){
		
	mediaAltura = mediaAltura + altura;
	
		//Variavel
	double media = mediaAltura / contaJogadores;
	
	return media;
	
	
	}
	
	
	//M�todo - Exibi��o
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
			   mensagem+=" \n\nM�dia de altura: "+String.format("%.2f",mediaJogadores());
			   
			   JOptionPane.showMessageDialog(null, mensagem);
		
	}
	
	
	//M�todo - Programa (La�o)
	public void ProgramaJogadores(){
		
		//Variavel
		int continuar = 0;
		
		//Aplicando o la�o
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