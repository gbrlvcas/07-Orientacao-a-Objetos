package exemplo02;


import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovados = 0, reprovados = 0;
	
	
	//Método para realizar as perguntas
	public void perguntas() {
		
		nome = JOptionPane.showInputDialog("Informe o nome do aluno");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1ª Nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2ª Nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3ª Nota"));
		
	}
	
	//Método de repetição
	public void laco(){
		
		//Váriavel
		int continuar = 0;
		
		//laço
		do{
			perguntas();
			exibirSituacao();
			contarAprovadosReprovados();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?","",0);
		}while(continuar == 0);
		
		//Exibir aprovados e reprovados
		exibirAprovadosReprovados();
	}
	
	//Método para retornar o cálculo de média
	public double calculodeMedia() {
		
		double media = (nota1+nota2+nota3)/3;
		
		return media;
	}
	
	//Método para retornar a situação do aluno
	public String situacaoAluno(){
		
		String situacao = calculodeMedia() >= 7 ? "Aprovado" : "Reprovado";
		
		return situacao;
	}
	
	//Exibir média e situação
	public void exibirSituacao() {
		
		//Mensagem
		String msg = "*****Informações do aluno*****\n\n";
			   msg+="Sua média é "+String.format("%.2f", calculodeMedia())+"\n";
			   msg+="Sua situação  é "+situacaoAluno()+"\n";
			   
		//Exibir mensagem
		JOptionPane.showMessageDialog(null, msg);
	}
	
	//Contar aprovado e reprovados
	
	public void contarAprovadosReprovados() {
		
		if(calculodeMedia() >= 7){
			aprovados++;
		}else{
			reprovados++;
		}
	}
	
	//Exibir a quantidade de aprovados e reprovados
	public void exibirAprovadosReprovados() {
		
		String msg = "Aprovados X Reprovados";
			   msg+= "\n Alunos aprovados: "+aprovados;
			   msg+= "\n Alunos reprovados: "+reprovados;
			   
		JOptionPane.showMessageDialog(null, msg);
	}
}
