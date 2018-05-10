package lista2_Exercicio01;

import javax.swing.JOptionPane;

public class Cadastro {

	
	//Atributos
	
	String nome;
	int sexo, idade, cargo;
	int sexoMasculino = 0, sexoFeminino = 0;
	int ger = 0, ate = 0, acou = 0, sec = 0, alm = 0, pad = 0, est = 0;
	int menor18 = 0, maior18 = 0;
	
	//M�todo de perguntas
	public void perguntas() {
		
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		
			String menuSexo = "**** Escolha o seu sexo ****";
					menuSexo+= "\n1) Masculino";
					menuSexo+= "\n2) Feminino";
			sexo = Integer.parseInt(JOptionPane.showInputDialog(menuSexo));
			
			String menuCargo = "****Escolha o seu carto****";
					menuCargo+= "\n1)Gerente";
					menuCargo+= "\n2)Atendente";
					menuCargo+= "\n3)A�ougueiro";
					menuCargo+= "\n4)Secret�ria";
					menuCargo+= "\n5)Almoxarife";
					menuCargo+= "\n6)Padeiro";
					menuCargo+= "\n7)Estagi�rio";
					
			cargo = Integer.parseInt(JOptionPane.showInputDialog(menuCargo));
					
	}
	
	//M�todo de contador de sexo
	public void contadorSexo() {
		
			//Condicional
			if(sexo == 1) {
				sexoMasculino++;
			}else if(sexo == 2) {
				sexoFeminino++;
			}
		
	}
	
	//M�todo de contador de cargo
	public void contadorCargo() {
		
			//Condicional
			switch(cargo) {
			case 1:
				ger++;
			break;
			case 2:
				ate++;
			break;
			case 3:
				acou++;
			break;
			case 4:
				sec++;
			break;
			case 5:
				alm++;
			break;
			case 6:
				pad++;
			break;
			case 7:
				est++;
			break;
			
	
			}
		
	}
	
	//M�todo de contador de idade
	public void contadorIdade() {
		
			//Condicional
		if(idade < 18) {
			menor18++;
		}else if(idade >= 18) {
			maior18++;
		}
	}
	
	//M�todo para mostrar a mensagem
	public void mostrarMensagem() {
		
		//Mensagem
		String mensagem = "**** Dados da empresa ****";
				mensagem+= "\nQuantidade de pessoas por sexo";
				mensagem+= "\n\nHomem: "+sexoMasculino;
				mensagem+= "\nMulher: "+sexoFeminino;
				mensagem+="\n\nQuantidade de pessoas por cargo";
				mensagem+="\nGerente: "+ger;
				mensagem+="\nAtendente: "+ate;
				mensagem+="\nA�ougueiro: "+acou;
				mensagem+="\nSecret�ria: "+sec;
				mensagem+="\nAlmoxarife: "+alm;
				mensagem+="\nPadeiro: "+pad;
				mensagem+="\nEstagi�rio: "+est;
				mensagem+="\n\nQuantidade de pessoas por classifica��o de idade";
				mensagem+="\nMenor de idade: "+menor18;
				mensagem+="\nMaior de idade: "+maior18;
				
				//Exibir mensagem
				JOptionPane.showMessageDialog(null, mensagem);
	}
						
	//M�todo de la�o
	public void lacoPrincipal() {
		
		//Variaveis
		int continuar = 0;
		
		do {
			perguntas();
			contadorCargo();
			contadorSexo();
			contadorIdade();
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?","",0);
			
		}while(continuar == 0);
		
		mostrarMensagem();
	}
}
