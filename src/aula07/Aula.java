package aula07;

public class Aula { 
	
	private boolean ativo;	

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria");
		p1.setIdade(20);		
		System.out.println(p1.getNome() + " - " + p1.getIdade());

		Pessoa p2 = new Pessoa();
		p2.setNome("Joana");
		p2.setIdade(-20);		
		System.out.println(p2.getNome() + " - " + p2.getIdade());
		

		PessoaMaiorIdade p3 = new PessoaMaiorIdade();
		p3.setNome("Renato");
		p3.setIdade(10);		
		System.out.println(p3.getNome() + " - " + p3.getIdade());
	}
}
