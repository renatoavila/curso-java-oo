package aula10;

public class Aluno extends Pessoa {

	private Turno turno;

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString() + "turno=" + turno + "]";
	}
	
	
}
