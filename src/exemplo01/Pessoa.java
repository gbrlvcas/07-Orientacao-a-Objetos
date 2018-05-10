//Classe = Molde

package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {
	
	//Atributos
	String nome;
	int idade;
	double peso, altura;
	
	//Método de apresentação
	public void apresentacao(){
		JOptionPane.showMessageDialog(null, "Olá! meu nome é "+nome);
	}
	
	//Cálculo de IMC
	public double calculoIMC() {
		
		double imc = peso / Math.pow(altura, 2);
		
		return imc;
	}

	//Situação do IMC
	public String situacaoIMC() {
		
		//Variável contendo a situação
		String situacao;
		
		//Obter o valor do imc
		double imc = calculoIMC();
		
		//Situação
		if(imc < 17){
			situacao = "Muito abaixo do peso";
		}else if(imc < 18.5){
			situacao = "Abaixo do peso";
		}else if(imc < 25){
			situacao = "Peso normal";
		}else if(imc < 30){
			situacao = "Acima do peso";
		}else if(imc < 35){
			situacao = "Obesidade I";
		}else if(imc < 40){
			situacao = "Obesidade II";
		}else{
			situacao = "Obesidade III";
		}
		
		//Retorno
		return situacao;
		
	}
	
	//Método para exibir o IMC e a situação
	public void exibirIMC() {
		
		//Mensagem
		String msg ="*****IMC*****\n";
			   msg+="\nSeu IMC é de: "+String.format("%.2f", calculoIMC());
			   msg+="\nSua situação é: "+situacaoIMC();
			   
	
		//Exibir mensagem
		JOptionPane.showMessageDialog(null, msg);
		
	}

}
