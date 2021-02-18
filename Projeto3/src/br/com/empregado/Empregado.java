/*****************************************************************************************************************
* Prova Técnica Java --> Projeto 3 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.empregado;

public class Empregado {
	
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	private static int totalEmpregados = 0;
	
	double aumentoSalario = 0.10;
		
	public Empregado() {
		Empregado.totalEmpregados = Empregado.totalEmpregados + 1;
	}

	public static int getTotaldeEmpregados() {

		return Empregado.totalEmpregados;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal = salarioMensal + (salarioMensal * aumentoSalario);
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

}
