package aula10;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	
	private String sobrenome;
	
	private LocalDate dataNascimento;
	
	private char sexo;

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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimento=" + dataNascimento + ", sexo="
				+ sexo + ", ";
	}	
}
