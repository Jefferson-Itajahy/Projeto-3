/*****************************************************************************************************************
* Prova Técnica Java --> Projeto 3 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.empregado;

public class EmpregadoTeste {

	public static void main(String[] args) {
	
		Empregado empregado1 = new Empregado();
		Empregado empregado2 = new Empregado();
				
		empregado1.setNome("João");
		empregado2.setNome("Maria");
		
		empregado1.setSobrenome("Martins");
		empregado2.setSobrenome("Santos");
		
		empregado1.setSalarioMensal(1000);
		empregado2.setSalarioMensal(2000);
				
		System.out.println(empregado1.getSalarioMensal() * 12);
		System.out.println(empregado2.getSalarioMensal() * 12);
		
		System.out.println(Empregado.getTotaldeEmpregados());
	}

}
