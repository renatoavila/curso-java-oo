package aula12;

public class Aula {

	public static void main(String[] args) {
		
		//Funcionario f = new Funcionario();
		
		Programador p = new Programador();
		p.setNome("Joao Nascimento");
		p.setSalario(2800.95);
		System.out.printf("Programador: %s - R$: %.2f", p.getNome(), p.calculaSalario());
		
		System.out.println();
		
		Analista a = new Analista();
		a.setNome("Ricardo Pinheiro");
		a.setSalario(2800.95);
		System.out.printf("Analista: %s - R$: %.2f", a.getNome(), a.calculaSalario());
		
		System.out.println();
		
		ImplantadorJunior i = new ImplantadorJunior();
		i.setNome("Alice Ribas");
		i.setSalario(2800.95);
		System.out.printf("Imp. Junior: %s - R$: %.2f", i.getNome(), i.calculaSalario());
	}
}
