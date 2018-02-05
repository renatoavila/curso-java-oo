package aula20;

public class Aula {

	public static void main(String[] args) {
		Calculo c = new Calculo();
		System.out.println("Soma = " + c.somar(10, 5));
		System.out.println("Multiplicacao = " + c.multiplicar(5, 10));
		
		Aula a = new Aula();
		System.out.println("MySoma = " + a.mySoma(8, 5));
		
		a.imprime(new Executa() {

			@Override
			public void executar() {
				
				Calculo c = new Calculo();
				System.out.println("Soma = " + c.somar(55, 5));
				System.out.println("Multiplicacao = " + c.multiplicar(55, 10));
				
			}
			
		});
	}
	
	void imprime(Executa executa) {
		executa.executar();
	}
	
	int mySoma(int z, int y) {
		
		Adicao adicao = new Adicao() {

			@Override
			public int somar(int a, int b) {
				
				return b + a;
			}
			
		};
		
		return adicao.somar(z, y);
	}
}
