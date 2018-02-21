package aula04;

public class ExercicioAula04 {

	void tabuda(int x) {
		for (int i = 1; i < 11; i++) {
			System.out.println( i + "*" + x + " = "+ (i*x));
		}
	}
	
	public static void main(String[] args) {
		ExercicioAula04 ex = new ExercicioAula04();
		ex.tabuda(2);
	}
}
