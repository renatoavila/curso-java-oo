package aula11;

public class Aluno extends Pessoa {
	
	@Override
	public void setMatricula(String matricula) {
		if (matricula.length() == 10) {
			super.setMatricula(matricula);
		} else {
			System.out.println("Matricula invalida para o aluno " + getNome());
		}
	}

	@Override
	public void imprime(String cor, String tipo) {
				
	}
	
	
}
