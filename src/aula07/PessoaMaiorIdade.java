package aula07;

public class PessoaMaiorIdade extends Pessoa {

	@Override
	public void setIdade(int idade) {
		if (idade >= 18) {
			super.setIdade(idade);
		} else {
			super.setIdade(0);
		}
	}
}
